package week8;

import java.util.Scanner;

public class SimpleSearch {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int snum = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < ar.length; i++) {
            if (snum == ar[i]) {
                System.out.println(i+1);
                found = true;
            }
        }
        if(found==false) System.out.println(-1);
    }
}
