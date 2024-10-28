package sortAlgorithm;

public class BubbleSort {

    public static void bubbleSortAscending(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    // Hoán đổi hai phần tử
                    int temp = nums[i];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[b] = nums[a];
        nums[a] = temp;
    }

        // Hàm sắp xếp từ lớn đến bé
        public static void bubbleSortDescending(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (nums[j] < nums[j + 1]) {
                        // Hoán đổi hai phần tử
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
        }
    
    
}
