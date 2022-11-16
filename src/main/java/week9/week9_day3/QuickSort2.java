package week9.week9_day3;

public class QuickSort2 {
    public static void main(String[] args) {

        var arr = new int[]{20, 18, 5, 19, 40, 25, 5, 50};
        int pivot = arr[arr.length / 2];

        int leftIdx =0;
        while (arr[leftIdx] < pivot) {
            leftIdx +=1;
        }


    }
}
