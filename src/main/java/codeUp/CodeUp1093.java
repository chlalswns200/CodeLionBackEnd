package codeUp;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }

        int num = sc.nextInt();

        int[] ar2 = new int[num];

        for (int j = 0; j < num; j++) {
            ar2[j] = sc.nextInt();
        }

        for (int i : ar2) {
            arr[i-1]++;
        }
        for (int i = 0; i < 23; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}