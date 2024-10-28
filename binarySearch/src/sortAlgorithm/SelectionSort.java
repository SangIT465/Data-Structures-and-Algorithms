package sortAlgorithm;

public class SelectionSort {
    
    public static void selectionSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Hoán đổi phần tử nhỉ nhất tìm được với phần tử đầu tiên của đoạn chưa sắp xếp
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

}
