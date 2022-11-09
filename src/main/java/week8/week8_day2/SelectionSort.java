package week8.week8_day2;

import java.util.Arrays;

interface StatementStrategy {
    boolean apply(int a, int b);
}

public class SelectionSort {

    public int[] selectionSort(int[] arr,StatementStrategy stmt) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx=i;
            for (int j = i + 1; j < arr.length; j++) {
                if(stmt.apply(arr[minIdx],arr[j])) minIdx= j;
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort ss = new SelectionSort();

        ss.selectionSort(arr,(a,b)->a<b);
        ss.selectionSort(arr,(a,b)->a>b);

    }
}
