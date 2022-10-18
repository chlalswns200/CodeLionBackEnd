package codeUp;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long i=a;
        for (long j = 0; j < c-1; j++) {
            i = i*b;
        }
        System.out.println(i);
    }
}