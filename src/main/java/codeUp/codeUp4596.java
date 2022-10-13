package codeUp;

public class codeUp4596 {
    public int getMax(int[] arr) {
        int maxValue = 0;
        //loop 구성
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {

        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61 };
    }
}
