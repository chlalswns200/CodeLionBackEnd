package codeUp;

import java.util.Scanner;

public class CodeUp1859 {

    public void printARow(int n, String now) {

        System.out.println(now);
        if (n == now.length()) {
            return;
        }
        printARow(n, now+"*");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        new CodeUp1859().printARow(n,"*");
    }
}