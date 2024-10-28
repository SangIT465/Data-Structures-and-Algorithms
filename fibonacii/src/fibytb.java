import java.util.Scanner;

public class fibytb {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = ip.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

}
