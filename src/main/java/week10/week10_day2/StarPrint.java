package week10.week10_day2;

import java.util.Scanner;

public class StarPrint {

    private static void star(int i) {

        if(i == 0 ) return ;
        System.out.print("*");
        star(i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        star(i);
    }
}
