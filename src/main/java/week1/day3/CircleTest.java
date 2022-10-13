package week1.day3;

class Circle{
    int radius;
    String color;

    double calcArea() {
        return 3.14 * radius * radius;
    }
}


public class CircleTest {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.radius = 3;
        obj.color = "blue";
        double area = obj.calcArea();
        System.out.println("area = " + area);

    }
}
