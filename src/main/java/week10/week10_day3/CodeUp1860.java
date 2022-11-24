package week10.week10_day3;

import java.util.Scanner;

public class CodeUp1860 {

    public static void getNum(int n){
        if(n==0) return;
        getNum(n-1);
        System.out.printf("%d ", n);
    }
    public static void printNum(int n){
        if(n==0) return;
        printNum(n-1);
        getNum(n);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNum(n);
    }
}
