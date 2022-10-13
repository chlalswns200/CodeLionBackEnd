package week2.day6;

abstract class Animal {
    public abstract void move(); // 함수 바디를 구현 하지 않겠다
}

class Lion extends Animal {

    @Override
    public void move() {
        System.out.println("사자의 move 메소드입니다");
    }
}
public class AbsEx {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.move();
    }
}
