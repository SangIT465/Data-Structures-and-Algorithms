package sortAlgorithm;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1); // Sắp xếp phần tử nhỉ hơn pivot
            quickSort(arr, pivot + 1, high); // Sắp xếp phần tử lớn hơn pivot
        }
    }

    // Hàm chia mảng vả trả về chỉ số pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Chỉ số của phần tử nhỏ hơn pivot

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // hoán đổi arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Hoán đổi arr[i+1] và arr[high] (hoặc pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
            
        return i + 1;
    }

}
