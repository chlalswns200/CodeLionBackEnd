package week10.week10_day2;

public class sumOfDigit {

    public static int sumOfDigit(int q) {
        if(q==0) return 0;
        return q%10 + sumOfDigit(q/10);
    }
    public static void main(String[] args) {
        int i = sumOfDigit(123);
        System.out.println("i = " + i);
    }
}
