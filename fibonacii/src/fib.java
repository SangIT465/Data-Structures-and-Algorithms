import java.util.Scanner;

public class fib {
     public static long fib1(int n) {
        long[] f = new long[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }   

    //  F(n) = F(n-1) + F(n-2)
    // F0 = 0 and F1 = 1
    public static long fib2(int n ) {
        if(n <= 1)
        return n;
        return fib2(n-1) + fib2(n-2);
    }
    // fib(4) + fib(3)
    // fib(3) + fib(2) + fib(2) + fib(1)
    // fib(2) + fib(1) + fib(1) + fib(0) + fib(1) + fib(0) + 1
    // fib(1) + fib(0) + 1 + 1 + 0 + 1 + 0 + 1
    // 1 + 0 + 1 + 1 + 0 + 1 + 0 + 1


     public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.println("Nhap n = ");
        int n = ip.nextInt();
        //
        long t0 = System.currentTimeMillis();  // bắt đầu đo thời gian mili giây
        System.out.println("Lap: phan tu thu " + n + " la: " + fib1(n));
        //
        long t1 = System.currentTimeMillis();
        System.out.println("Thoi gian chay cua tt lap: " + (t1 - t0));
        //
        System.out.println("De quy: phan tu thu " + n + " la: " + fib2(n));
        long t2 = System.currentTimeMillis();
        //
        System.out.println("Thoi gian chay cua tt de quy: " + (t2 - t1));
        ip.close();
        
    }
}
