import java.util.Arrays;

public class MyQuickSort {
    
    public static void quickSort(int[] a, int L, int R) {
        // Điều kiện dừng
        if (L >= R) return;
        // B1. Chọn khóa key
        int key = a[(L + R) / 2];  // 0-7 -> (0+7)/2 = 3

        // B2. Phân bổ lại mảng theo khóa key
        int k = partition(a, L, R, key); // k là pivot

        // B3. Chia đôi mảng --> lặp lại
        quickSort(a, L, k - 1);
        quickSort(a, k, R);
    }

    // return pivot value
    static int partition(int[] a, int L, int R, int key) { // Đã sửa lại kiểu trả về là int
        int iL = L;
        int iR = R;
        while (iL <= iR) {
            // Với iL, đi tìm phần tử >= key để đổi chỗ
            while(a[iL] < key) iL++;
            // Với iR đi tìm phần tử <= key để đổi chỗ
            while(a[iR] > key) iR--;
            // Đổi chỗ hai phần tử đang đứng không đúng vị trí
            if (iL <= iR) {
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL; // Trả về chỉ số mới của iL
    }
    
    public static void main(String[] args) {
        int[] a = {6, 7, 8, 5, 4, 1, 2, 3};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

}
