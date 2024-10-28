public class FindNumbers {
    public static int FindNumbers(int[] nums) {
        int count = 0;

        for (int a : nums) {
            //kiểm tra số chữ số của a
            // Nếu số chữu số là chẵn => Tăng biến đếm lên 1
            int soLuongChuSo = tinhSoChuSo(a);
            if(soLuongChuSo % 2 == 0) {
                count++;
            } 
        }
        return count;
    }

    private static int tinhSoChuSo(int a) {
        int count = 0; // biến đếm số lượng chữ số
        int kq = a;    // biến này lưu kết quả trung gian

        while(kq != 0) {
            kq = a / 10; // chia a cho 10 để loại chữ số cuối ạ
            a = kq;     // gán giá trị (kết quả mới tìm được) của a
            count++;
        }
        return count;
    }

    
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int[] n2 = new int[6];  // cách khai báo mang thứ 2

        for (int num: nums) {
            System.out.println("num= " + num);
        }

        // Duyệt và lấy giá trị từng phần tử của mảng và lấy index tại phần tử đó
        for (int i = 0; i < nums.length; i++) {
            System.out.println(" num[" + i + "] = " + nums[i]);
        }

        // test hàm tính số chữ số
        System.out.println("\nSo chu so la: " + tinhSoChuSo(1));
        System.out.println("So chu so la: " + tinhSoChuSo(99));
        System.out.println("So chu so la: " + tinhSoChuSo(321));
        System.out.println("So chu so la: " + tinhSoChuSo(2133));

        System.out.println("\n=======================\n");
        // test hàm tính số chữ số chẵn của mảng
        System.out.println("So chu so chan co trong mang la: " + FindNumbers(nums));
    }
}
