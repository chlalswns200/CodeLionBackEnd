package week10.week10_day2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci2 {
    static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    static int fib(int n) {
        if(n==1|n==2) return 1;
        
        List<Integer> fibonacciNums = new ArrayList<>();
        fibonacciNums.add(1);
        fibonacciNums.add(1);
        for (int j = 2; j < n; j++) {
            fibonacciNums.add(fibonacciNums.get(j - 1) + fibonacciNums.get(j - 2));
        }
        return fibonacciNums.get(n-1);
    }

    public static void main(String[] args) {
        int fib = fib(5);
        System.out.println("fib = " + fib);
        
    }
}
