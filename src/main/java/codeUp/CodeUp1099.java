package codeUp;

import java.util.Scanner;

public class CodeUp1099 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = 1;
        int y = 1;

        while (x < 10 && y < 10) {
            if (arr[1][1] == 2) {
                arr[1][1] = 9;
                break;
            } else {
                arr[1][1] = 9;
            }
            if (x < 10 && y + 1 < 10 && arr[x][y + 1] == 0) {
                arr[x][y + 1] = 9;
                y++;
            } else if (x < 10 && y + 1 < 10 && arr[x][y + 1] == 2) {
                arr[x][y + 1] = 9;
                break;
            } else if (x + 1 < 10 && y < 10 && arr[x + 1][y] == 0) {
                arr[x + 1][y] = 9;
                x++;
            } else if (x + 1 < 10 && y < 10 && arr[x + 1][y] == 2) {
                arr[x + 1][y] = 9;
                break;
            } else {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}