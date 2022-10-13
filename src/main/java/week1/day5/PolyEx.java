package week1.day5;

public class PolyEx {
    public static void print(Shape shape) {

        if (shape instanceof Rectangle) {
            System.out.println("실제 타입은 Rectangle 입니다");
        } else if (shape instanceof Circle) {
            System.out.println("실제 타입은 Circle 입니다");
        } else {
            System.out.println("알 수 없는 타입입니다.");
        }
    }
    public static void main(String[] args) {

         Shape[] shape = {new Triangle(10,10),new Rectangle(10,10),new Circle(10)};

         double sumArea = 0;

         for (Shape s : shape) {
         sumArea += s.getArea();
         }
    }
}
