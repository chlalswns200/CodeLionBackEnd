package week8.week8_day2;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ar = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int i = 0;
        int maxIdx = 0;
        for (int j = 0; j < ar.length; j++) {
            if (ar[maxIdx] < ar[j]) {
                maxIdx = j;
            }
        }
        System.out.println("maxIdx = " + maxIdx);
    }
}
