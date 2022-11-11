package week8.week8_day4;

public class Binary {
    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = new int[]{9, 20, 28, 18, 11};


        for (int i : arr1) {
            String zero = "0";
            String result = "";
            for(int j=i; j>0; j/=2) {
                result = String.valueOf(j%2) + result;
            }
            if (n - result.length() > 0) {
                zero.repeat(n-result.length());
                result = zero+result;
            }
            System.out.println(result);
        }
    }
}
