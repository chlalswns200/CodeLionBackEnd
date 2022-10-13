package week1.day4;

import java.util.Scanner;


public class Grade4 {
    static class Grade {
        public Grade(int math, int science, int english) {
            this.math = math;
            this.science = science;
            this.english = english;
        }

        int math;
        int science;
        int english;
        public double average() {
            return (math + science + english) / (double) 3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 "+me.average()); // average()는 평균을 계산하여 리턴

        sc.close();

    }
}
