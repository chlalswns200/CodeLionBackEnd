package week2.day7;

class InstCnt {
    static int instNum = 0;

    InstCnt() {
        instNum++;
        System.out.println("인스턴스 생성:" + instNum);
    }

}

public class StaticTest {
    public static void main(String[] args) {

        InstCnt cnt1 = new InstCnt();
        InstCnt cnt2 = new InstCnt();
        InstCnt cnt3 = new InstCnt();

        int a= 3;
        int b = 3;
        System.out.println("a = " + a);
        System.out.println("a++ = " + a++);
        System.out.println("a = " + a);
        System.out.println("b++ = " + ++b);

        System.out.println("b = " + b);


    }
}
