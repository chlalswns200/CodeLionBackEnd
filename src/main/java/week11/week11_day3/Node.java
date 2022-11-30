package week11.week11_day3;

public class Node {
    public static int goUp(int a, int b) {
        if(a > b) {
            return goUp(a / 2, b) + 1; // a를 부모 쪽으로
        } else if (a < b) {
            return goUp(a, b / 2) + 1; // b를 부모 쪽으로
        } else { // a == b
            return 0;
        }
    }
    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        int i = goUp(a, b);
        System.out.println("i = " + i);
    }
}
