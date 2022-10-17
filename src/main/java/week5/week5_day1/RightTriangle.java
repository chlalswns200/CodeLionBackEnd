package week5.week5_day1;

import java.util.Scanner;

public class RightTriangle {

    private String letter = "*";

    public RightTriangle() {
    }

    public RightTriangle(String letter) {
        this.letter = letter;
    }

    private void drwaTriangle1(int n) {
        for (int i=1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(this.letter);
            }
            System.out.println("");
        }
    }

    private void drwaTriangle2(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(n-i-1));
            System.out.println((this.letter).repeat(2*i+1));

        }
    }


    private void drwaRhombus(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(n-i-1));
            System.out.println((this.letter).repeat(2*i+1));
        }
        for (int i = n-1; i > 0; i--) {
            System.out.print(" ".repeat(n-i));
            System.out.println((this.letter).repeat(2*i-1));
        }
    }

    public static void main(String[] args) {

        RightTriangle rt = new RightTriangle();
        rt.drwaRhombus(5);
    }
}
