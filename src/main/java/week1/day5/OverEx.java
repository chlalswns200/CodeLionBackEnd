package week1.day5;

class Shape {

    private int a, b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Shape() {
        System.out.println("도형입니다. ");
    }

    public void draw() {
        System.out.println("도형을 그립니다.");
    }

    public double getArea() {
        return (double) a * b;
    }
}

//상속 관계에서 부모의 함수를 덮어 쓰는것(바디만 달리하는 것)
class Rectangle extends Shape{

    public Rectangle(int a, int b) {
        super(a, b);
    }

    public Rectangle() {

    }

    @Override
    public void draw() {
        System.out.println("사각형 도형을 그립니다.");
    }


}

class Triangle extends Shape{

    public Triangle(int a, int b) {
        super(a, b);
    }

    public Triangle() {
    }

    @Override
    public void draw() {
        System.out.println("삼각형 도형을 그립니다.");
    }

    @Override
    public double getArea() {
        return super.getArea() / (double) 2;
    }



}

class Circle extends Shape{

    public Circle(int a) {
        super(a, a);
    }

    public Circle() {
    }

    @Override
    public void draw() {
        System.out.println("원 도형을 그립니다.");
    }

    @Override
    public double getArea() {
        return super.getA()*super.getB()*Math.PI;
    }



}

public class OverEx {

    public static void main(String[] args) {
        //1번
        //Shape shape = new Shape();
        //shape.draw();
        //2번
        //Rectangle rectangle = new Rectangle();
        //rectangle.draw();



    }

}
