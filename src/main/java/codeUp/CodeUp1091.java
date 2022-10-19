package codeUp;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long i=a;
        for (long j = 0; j < d-1; j++) {
            i = (i * b)+c;
        }
        System.out.println(i);
    }
}