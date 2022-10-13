package week1.day5.homework;


public class Hm2 {

    static int[] bubuleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {7, 4, 5, 1, 3};

        bubuleSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
