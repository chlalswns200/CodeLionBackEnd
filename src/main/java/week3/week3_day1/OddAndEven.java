package week3.week3_day1;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}

/*
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
* */
