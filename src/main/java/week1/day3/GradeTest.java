package week1.day3;

import java.util.Scanner;

public class GradeTest {
    static class Grade {
        public void setKorean(int korean) {
            this.korean = korean;
        }

        public void setMath(int math) {
            this.math = math;
        }

        public void setEnglish(int english) {
            this.english = english;
        }

        public int getKorean() {
            return korean;
        }

        public int getMath() {
            return math;
        }

        public int getEnglish() {
            return english;
        }

        int korean;
        int math;
        int english;

        public double getAvg() {
            return (korean + math + english) / 3.0;
        }

        public String getGrade() {

            double avg = getAvg();

            if (avg >= 90) {
                return "수";
            } else if (avg >= 80) {
                return "우";
            } else if (avg >= 70) {
                return "미";
            } else if (avg >= 60) {
                return "양";
            } else {
                return "가";
            }

        }
    }

    public static void main(String[] args) {

        Grade studentA = new Grade();
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 성적 : ");
        int korean = sc.nextInt();
        studentA.setKorean(korean);

        System.out.print("수학 성적 : ");
        int math = sc.nextInt();
        studentA.setMath(math);

        System.out.print("영어 성적 : ");
        int english = sc.nextInt();
        studentA.setEnglish(english);

        System.out.println("국어 = " + studentA.getKorean() + " 수학 = " + studentA.getMath() +
                " 영어 = " + studentA.getEnglish() +" 평균 = " + studentA.getAvg() + " 등급 = " + studentA.getGrade());

    }

}
