package week9;

import java.util.Arrays;

public class Eratos {
    public static void main(String[] args) {

        int N = 50;
        int[] arr = new int[N-1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+2;
        }

        for (int i = 2; i < arr.length; i+=2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }
}