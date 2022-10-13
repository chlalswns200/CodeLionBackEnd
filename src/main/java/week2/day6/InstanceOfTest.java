package week2.day6;

class Parent {
    public Parent() {
    }
    public void print() {
        System.out.println("부모 클래스 print 함수");
    }
}

class Child extends Parent{

    public Child() {
    }

    @Override
    public void print() {
        System.out.println("자식 클래스 print 함수");
    }
}

public class InstanceOfTest {

    public static void main(String[] args) {
        Parent objA = new Parent();
        Child objB = new Child();

        Parent objC = new Child();

        // 기본 객체
        System.out.println( objA instanceof Parent );  // true
        System.out.println( objB instanceof Child );   // true
        System.out.println(objA instanceof Child); // false
        System.out.println(objB instanceof Parent); // true

        // 다형성 객체
        System.out.println( objC instanceof Parent); // true
        System.out.println( objC instanceof Child); // true
        System.out.println(objC.getClass().getName()); // Child
    }


}
