package week1.day4;

import java.util.Scanner;

public class Am1 {
    public static void main(String[] args) {

        String strArr[][] = new String[5][5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                strArr[i][j] = " ";
            }
        }

        int col,row;
        System.out.print("행 인덱스 입력 >> ");
        row = sc.nextInt();
        System.out.print("열 인덱스 입력 >> ");
        col = sc.nextInt();

        strArr[row][col] = "X";

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.println(" 0 1 2 3 4");
            }
            System.out.print(i);
            for (int j = 0; j < 5; j++) {
                System.out.print(" "+strArr[i][j]);
            }
            System.out.println();
        }


    }
}
