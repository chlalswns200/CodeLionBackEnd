package codeUp;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] a = new int[50][50];
        int i, j, k, l, d, x, y;
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        for (k = 0; k < n; k++) {
            l = sc.nextInt(); //길이
            d = sc.nextInt(); //방향
            x = sc.nextInt(); //행
            y = sc.nextInt(); //열
            x--;
            y--;
            if (d == 0) {//
                for (i = 0; i < l; i++) {
                    a[x][y + i] = 1;
                }
            } else if (d == 1) {
                for (i = 0; i < l; i++) {
                    a[x + i][y] = 1;
                }
            }
        }
        for (i = 0; i < h; i++) {    //출력
            for (j = 0; j < w; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}