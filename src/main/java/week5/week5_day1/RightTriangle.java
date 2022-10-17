package week5.week5_day1;

import java.util.Scanner;

public class RightTriangle {

    private void drwaTriangle1(int n) {
        for (int i=1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private void drwaTriangle2(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(n-i-1));
            System.out.println("*".repeat(2*i+1));
        }
    }

    public static void main(String[] args) {

        RightTriangle rt = new RightTriangle();
        rt.drwaTriangle2(7);
    }
}
