package week2.day7.homework;

public class hm1 {
    public static void main(String[] args) {

        int ar[] = {7, 3, 2, 8, 9, 4, 6, 1, 5};

        insertSort(ar);

        for (int i : ar) {
            System.out.print(" " + i);
        }
    }

    private static void insertSort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {

            int target = i;
            while (target > 0) {
                if (ar[target] < ar[target - 1]) {
                    int tmp = ar[target];
                    ar[target] = ar[target - 1];
                    ar[target - 1] = tmp;
                    target--;
                } else {
                    break;
                }
            }
        }
    }
}
