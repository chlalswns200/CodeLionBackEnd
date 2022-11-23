package week10.week10_day2;

public class SumNum {


    private static int sumAll(int i) {

        if(i==0) return i;
        return i + sumAll(i-1);
    }

    public static void main(String[] args) {

        int sum = sumAll(10);
        System.out.println("sum = " + sum);
    }
}
