package codeUp;

import java.util.Scanner;

public class CodeUp1094 {
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
        for (int i = ar2.length-1; i >=0 ; i--) {
            System.out.print(ar2[i]+" ");
        }


    }
}