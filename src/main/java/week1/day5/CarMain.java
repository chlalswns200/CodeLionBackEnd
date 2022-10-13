package week1.day5;

public class CarMain {
    public static void main(String[] args) {
        SportsCarEx obj = new SportsCarEx();
        obj.setSpeed(30);// 스포츠카 클래스에 speed는 없지만 기존 Car class에서 상속
        //받았기 때문에 speed 변수와 setSpeeed 함수를 사용할 수 있다


    }
}
