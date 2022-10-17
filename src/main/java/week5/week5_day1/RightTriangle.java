package week5.week5_day1;

import java.util.Scanner;

public class RightTriangle {

    private void drwaTriangle(int n) {
        for (int i=1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RightTriangle rt = new RightTriangle();
        int n = sc.nextInt();
        rt.drwaTriangle(n);

    }
    // n = 7 출력
    /*
     *
     **
     ***
     ****
     *****
     ******
     *******
     */
}
