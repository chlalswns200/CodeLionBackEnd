package week8.week8_day4;

public class Binary {
    public static void main(String[] args) {

        int n =12;
        String result = ""; //출력할 값

        for(int i=n; i>0; i/=2) {
            result = String.valueOf(i%2) + result;
        }

        System.out.println(result);
    }
}
