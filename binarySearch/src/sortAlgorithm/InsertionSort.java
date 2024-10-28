package sortAlgorithm;

public class InsertionSort {

    public static void insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int temp = nums[i];
            int j = i - 1;

            // Di chuyển các phần tử của nums[0... i-1] lớn hơn temp về phía sau
            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = temp;
        }
    }

    // Phương thức đảo ngược mảng
    public static void reverseArray(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
