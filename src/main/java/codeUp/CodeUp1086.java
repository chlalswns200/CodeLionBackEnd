package codeUp;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(String.format("%.2f MB", (w*h*b) / 8388608));
    }
}