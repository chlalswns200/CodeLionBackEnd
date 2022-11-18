package week9.week9_day4;

import java.util.Arrays;

public class MatrixPlus {

    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {
                int num = arr1[i][j]+arr2[i][j];
                answer[i][j] = num;
            }

        }
        return answer;
    }

    public static void main(String[] args) {

        MatrixPlus mp = new MatrixPlus();
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};

        int[][] solution = mp.solution(arr1, arr2);
        for (int[] ints : solution) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }

}
