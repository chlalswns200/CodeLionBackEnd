package week10.week10_day3;

import java.util.Scanner;

public class CodeUp1859 {

    public static void getStar(int n){
        if(n==0) return;

        getStar(n-1);
        System.out.print("*");

    }
    public static void printStar(int n){

        if(n==0) return;

        printStar(n-1);
        getStar(n);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printStar(n);
    }
}
