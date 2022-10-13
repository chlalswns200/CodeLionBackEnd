package week2.day6.homework;

public class Hm1 {

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
    }

    public static void main(String[] args) {

        int arr[] = {7, 3, 2, 8, 9,4,6,1,5};

        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
