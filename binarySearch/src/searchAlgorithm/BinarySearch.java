package searchAlgorithm;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {

        // if (!isSorted(arr)) {
        //     System.out.println("Mang chua duoc sap xep. Vui long sap xep mang truoc khi tim kiem.");
        //     return -1;
        // }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target is greater is present at mid
            if (arr[mid] < target)
                left = mid + 1;

            // If target is smaller, ignore right half
            else
                right = mid - 1;
        }
        // Target not found
        return -1;
    }

    // // Phương thức kiểm tra xem mảng đã được sắp xếp hay chưa
    // public static boolean isSorted(int[] arr) {
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] < arr[i - 1]) {
    //             return false; // Nếu có phần tử nào đó không đúng thứ tự, trả về false
    //         }
    //     }
    //     return true; // Mảng đã được sắp xếp
    // }

    // // Phương thức tìm kiếm nhị phân đệ quy
    // public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
    //     if (right >= left) {
    //         int mid = left + (right - left) / 2;

    //         // Check if target is present at mid
    //         if (arr[mid] == target) {
    //             return mid;
    //         }

    //         // If target is greater, ignore left half
    //         if (arr[mid] < target) {
    //             return binarySearchRecursive(arr, target, mid + 1, right);
    //         }

    //         // If target is smaller, ignore right half
    //         return binarySearchRecursive(arr, target, left, mid - 1);
    //     }
    //     // Target not found
    //     return -1;
    // }

}
