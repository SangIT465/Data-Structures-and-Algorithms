package sortAlgorithm;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {

            // Tìm điểm chia mảng
            int mid = (left + right) / 2;

            // Sắp xếp mảng con bên trái
            mergeSort(arr, left, mid);

            // Sắp xếp mảng con bên phải
            mergeSort(arr, mid + 1, right);

            // Hợp nhất mảng đã sort
            merge(arr, left, mid, right);
        }
    }
    
    // Hàm hợp nhất hai mảng đã sắp xếp
    public static void merge(int arr[], int left, int mid, int right) {
        // Kích thước của hai mảng cần được hợp nhất
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // tạo các mảng tạm để lưu trữ dữ liệu
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Sao chép dữ liệu mảng gốc vào mảng tạm
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }          
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
           
            // Merge the temp arrays

        // Chỉ số ban đầu của mảng thứ nhất và thứ hai
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        // (Sao chép các phần tử còn lại mảng L vào mảng gốc ( nếu có))
        while ( i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
