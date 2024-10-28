import java.util.Arrays;

public class RemoveArray {

    
    public static int removeElement(int[] a, int val) {
        int n = a.length;
        
        for (int i = 0; i < n;)
            if (a[i] == val) {
                // xoa phan tu a[i] thi i giu nguyen
                for (int j = i; j<= (n-2); j++) {
                    a[j] = a [j+1];
                }
                n--;
        } else {
            i++; // khong phai xoa thi tang 1
        }
        return n;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 2, 3};

        System.out.println("Mang a ban dau la: " + Arrays.toString(a) + ", co chieu dai = " + a.length);
        System.out.println("Chieu dai cua mang sau khi xoa gia tri 2 la: " + removeElement(a, 2)); // khi xóa hết các phần tử giá tị là 2
 
        System.out.println("=====DONE=====");
    }

}
