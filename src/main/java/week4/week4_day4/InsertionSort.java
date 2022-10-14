package week4.week4_day4;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] arr) {

        int i = 1;

        if (arr[i] < arr[i - 1]) {
            int tmp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = tmp;

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
