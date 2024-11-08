package quickSort;
public class Ex03_QuickSort {
    
    public static void quickSort(int[] arr, int low, int high) {
        // Kiểm tra số phần tử trong dãy > 2 không?
        if (low < high) {
            int pivot = partition(arr, low, high);

            // Sắp xếp các phần tử bên trái, phải
            quickSort(arr, low, pivot - 1); //trai
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int mid = (high + low) / 2;
        int pivot = arr[mid]; // chọn phần tử giữa làm pivot

        // ĐƯa pivot về vị trí cuối để dễ thực hiện phân hoạch
        int temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp;

        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                // hoán đổi 
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        // ĐƯa pivot về đúng vị trí chính xác
        temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // vị trí của pivot
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 6, 9, 3, 2};
        int n = arr.length;

        System.out.println("Mang ban dau");
        printArray(arr);

        quickSort(arr, 0, n - 1);
        
        System.out.println("Mang sau khi sap xep(Quick Sort)");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int value: arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
