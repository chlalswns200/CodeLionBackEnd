package codeUp;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = 0;
            }
        }

        int num = sc.nextInt();

        for (int j = 0; j < num; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a-1][b-1] = 1;
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+ " ");
            }
            System.out.println();
        }


    }
}