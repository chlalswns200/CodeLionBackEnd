package codeUp;

import java.util.Scanner;

public class CodeUp1442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIdx=i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}