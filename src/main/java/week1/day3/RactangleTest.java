package week1.day3;

public class RactangleTest {
    static class Rectangle {
        public void setH(int h) {
            this.h = h;
        }

        public void setW(int w) {
            this.w = w;
        }

        int h;
        int w;

        public int getA() {
            return h * w;
        }

    }
    public static void main(String[] args) {

        Rectangle rc = new Rectangle();
        Rectangle rc2 = rc;

        rc2.setH(10);
        rc2.setW(10);
        System.out.println(rc.getA());

        //rc.setW(10);
       // rc.setH(20);
        System.out.println(rc2.getA());

    }

}
