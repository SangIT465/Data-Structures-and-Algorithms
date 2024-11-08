package quickSort;
public class Ex02_QuickSort {
    
    public static void quickSort(int[] arr, int low, int high) {

        // Kiểm tra xem từ low -> high có ít nhất 2 phần tử để đủ điều kiện để tiếp tục quickSort
        if (low < high) {
            int pivot = partition(arr, low, high);
            // Gọi đệ quy để sắp cếp các phần tử bên trên và phải của pivot
            quickSort(arr, low, pivot - 1); // bên trái => low(6) < pivot(7)
            quickSort(arr, pivot + 1, high);// bên phải => 
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // chọn phần tử đầu tiên làm pivot
        int i = low + 1;  // vị trí của phần tử tiếp theo sau pivot (low + 1)

        for (int j = low + 1; j <= high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        // Đưa pivot về vị trí chính xác
        int temp = arr[low];
        arr[low] = arr[i - 1];
        arr[i - 1] = temp;

        return i - 1; // vi tri cua pivot
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        System.out.println("Mang ban dau:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("\nMang sau khi sap xep(Quick Sort):");
        printArray(arr);
    }

    // Hàm để in mảng
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
