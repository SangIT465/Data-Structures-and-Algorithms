package mergeSort;

public class Ex01_MergeSort {
    
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;

        // Chia đôi mảng
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Sao chép các phần tử mảng trái
        for (int i = 0; i < mid, i++) {
            left[i] = arr[i];
        }

        // Sap chép các phần tử mảng phải
        for (int i = mid; i < arr.length; i++) {
            
        }
    }

}
