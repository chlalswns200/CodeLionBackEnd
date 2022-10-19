package codeUp;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        int day=1;
        while (true) {
            if (day % a == 0 && day % b == 0 && day % c == 0) {
                System.out.println(day);
                break;
            }
            day++;
        }
    }
}