package week1.day4;

import java.util.Scanner;

class StrArr {

    private String strArr[][];

    public StrArr(String[][] str) {
        this.strArr = str;
    }
    public void init() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                strArr[i][j] = " ";
            }
        }
    }

    public void setX() {

        Scanner sc = new Scanner(System.in);
        int col,row;
        System.out.print("행 인덱스 입력 >> ");
        row = sc.nextInt();
        System.out.print("열 인덱스 입력 >> ");
        col = sc.nextInt();
        strArr[row][col] = "X";

    }
    public void print() {
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
public class X {
    public static void main(String[] args) {

        String[][] ar = new String[5][5];
        StrArr strArr = new StrArr(ar);

        strArr.init();
        strArr.setX();
        strArr.print();


    }
}
