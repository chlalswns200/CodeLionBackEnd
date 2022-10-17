package codeUp;

import java.util.Scanner;

public class CodeUp1443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}