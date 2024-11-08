public class Ex01_QuickSort {  // chọn pivot là phần tử cuối

    // Hàm để sắp xếp mảng sử dụng Quicksort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            // Sắp xếp các phần tử bên trái và bên phải của pivot
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    // Hàm phân hoạch (partition)
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // chọn phần tử cuối làm pivot
        int i = (low - 1);      // chỉ số của phần tử nhỏ hơn

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Hoán đổi arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Đặt pivot vào vị trí đúng
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Hàm main để chạy và kiểm tra thuật toán
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
