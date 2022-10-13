package week1.day5;

class A {

    public A() {
        System.out.println("A 생성자 호출");
    }
}

class B extends A{

    public B() {
        System.out.println("B 생성자 호출");
    }
}

class C extends B{

    public C() {
        System.out.println("C 생성자 호출");
    }
}

public class SuperTest {
    public static void main(String[] args) {
        C c = new C();
    }
}

