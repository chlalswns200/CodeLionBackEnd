package week1.day4;

// 정보 은닉 컴파일 에러 체크 코드

class Circle {

    private double rad = 0;
    final double PI = Math.PI;

    public void setRad(double rad) {
        if (rad < 0) {
            rad = 0;
            return;
        }
        this.rad = rad;
    }
    public Circle(double rad) {
        setRad(rad);
    }

}

public class HideEx {

    public static void main(String[] args) {
        Circle cirA = new Circle(1.5);

    }
}
