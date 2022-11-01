package week7.week7_day2;

public class PrimeNum {

    public int solution(String numbers) {
        int answer = 0;
        return answer;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = {8, 13, 17, 19, 23};
        String str = "17";
        PrimeNum pn = new PrimeNum();

    }
}
