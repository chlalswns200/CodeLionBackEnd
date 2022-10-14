package week4.week4_day4;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] ar = new int[]{8, 5, 6, 2, 4};
        InsertionSort is = new InsertionSort();
        int[] sort = is.sort(ar);
        System.out.println(Arrays.toString(sort));

    }
}
