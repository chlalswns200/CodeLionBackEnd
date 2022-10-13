package week1.day3;
import java.util.Scanner;

public class UpdownV2 {

    public static void main(String[] args) {
        UpDownRun();
    }

    private static void UpDownRun() {

        Scanner sc = new Scanner(System.in);
        final int answer = (int)(Math.random()*100) + 1;

        boolean check = false;
        for (int i = 0; i < 10; i++) {

            System.out.print("정답을 추축하여 보시오: ");
            int guess = sc.nextInt();
            if (answer < guess) {
                System.out.println("HIGH");
            } else if (answer > guess) {
                System.out.println("LOW");
            } else {
                System.out.println("축하합니다. 시도횟수= " + (i + 1));
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("실패입니다.");
            System.out.println("정답은= " + answer);
        }
    }
}
