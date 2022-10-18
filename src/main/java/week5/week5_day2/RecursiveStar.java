package week5.week5_day2;

public class RecursiveStar {

    public void printARow(int n, String now) {

        System.out.println(now);
        if (n == now.length()) {
            return;
        }
        printARow(n, now+"*");
    }
    public static void main(String[] args) {
        new RecursiveStar().printARow(7,"*");
    }
}
