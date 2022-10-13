package codeUp;

import java.util.Scanner;

public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max1 = (a>b)? b:a;
        int max2 = (max1>c)?c:max1;
        System.out.println(max2);
    }
}