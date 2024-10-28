import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        // sắp xếp mảng n1 trước rồi, sau đó mới thêm phần tử từ mảng khác
        // for (int i = 1; i< m; i++) {
        //     int k = n1[i];
        //     int j = i -1;

        //     while (j >= 0 && n1[j] > k) {
        //         n1[j + 1] = n1[j];
        //         j--;

        //     }
        //     n1[j+1] =k;
        // }

        // ngan hon khi dung dong nay
        Arrays.sort(n1, 0, m);

            // gop n2 vao n1
        for (int ai : n2) {
            chenPhanTuVaoMang(ai, n1, m);
            m++; // tang kich thuoc sau chen
        }
    }

    private static void chenPhanTuVaoMang(int x, int[] a, int m) {
        boolean timduocK = false;
        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                timduocK = true;
                for (int i = m-1; i >= k; i--) {
                    a[i+1] = a[i]; // dich cac phan tu sang phai de chen
                }
                a[k] = x; // chen ptu cao dung vi tri 
                break;
            }
        }
        
        if(!timduocK) {
            a[m] = x; // chen vao cuoi
        }
    }

    public static void main(String[] args) {
        int[] n1 = {3, 7, 2, 0, 0, 5, 6, 0}; // Lưu ý mảng n1 đủ lớn để chứa tất cả các phần t
        int[] n2 = {1, 4, 0};
        // đảm bảo n2 vào n1 không vượt quá size n1

        // Gop n2 vao n1
        merge(n1, 5, n2, n2.length);
        System.out.println("Ket qua sau khi gop mang n1 va n2: " + Arrays.toString(n1));
        System.out.println("=========DONE========");
    }

}
