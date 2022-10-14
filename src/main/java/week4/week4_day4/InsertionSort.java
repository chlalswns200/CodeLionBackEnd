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

    public int[] sortByRecursive(int[] arr, int i) {

        if(i == arr.length) return arr;

        for (int j = 0; j > 0; j--) {
            if (arr[j] > arr[j - 1]) {
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
            }
        }
        sortByRecursive(arr, i + 1);
        return arr;
    }

    public static void main(String[] args) {

        int[] ar = new int[]{8, 5, 6, 2, 4,7,10,9,1};
        InsertionSort is = new InsertionSort();

        int[] sort = is.sort(ar);
        System.out.println(Arrays.toString(sort));

        int[] ints = is.sortByRecursive(ar, 1);
        System.out.println(Arrays.toString(ints));

    }
}
