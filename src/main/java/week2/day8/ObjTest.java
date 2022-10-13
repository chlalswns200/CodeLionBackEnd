package week2.day8;

class Circle2 {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public Circle2(int radius) {
        this.radius = radius;
    }

    public boolean equals(Circle2 c1) {
        if (this.radius == c1.radius) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle2) {
            Circle2 c1 = (Circle2) obj;

            if (this.radius == c1.getRadius()) {
                return true;
            }else {
                return false;
            }
        }
        return false;
    }


}

public class ObjTest {
    public static void main(String[] args) {

        Circle2 cir1 = new Circle2(10);
        Circle2 cir2 = new Circle2(10);

        if (cir1 == cir2) {
            System.out.println("2개의 원은 같습니다");
        } else {
            System.out.println("2개의 원은 다릅니다");
        }

        if (cir1.equals(cir2)) {
            System.out.println("2개의 원은 같습니다");
        } else {
            System.out.println("2개의 원은 다릅니다");
        }

    }
}
