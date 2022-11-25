package week10.week10_day4;

public class GCD {

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
    public static int getGCD2(int num1, int num2) {
        while (num2 != 0) {
            int tmp = num1 % num2;
            num1 = num2;
            num2 = tmp;
        }
        return num1;
    }


    public static void main(String[] args) {
        int gcd = getGCD(154, 42);
        int gcd2 = getGCD2(154,42);
        System.out.println("gcd = " + gcd);
        System.out.println("gcd2 = " + gcd2);
    }
}
