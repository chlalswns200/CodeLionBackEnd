package week10.week10_day2;

public class Fibonacci2 {
    static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int fibo = fibonacci(10);
        System.out.println("fibo = " + fibo);
    }
}
