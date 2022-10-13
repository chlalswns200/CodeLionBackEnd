package week1.day4;

class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        return height * width;
    }

    public void show() {
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }


    boolean contains(Rectangle r) {


        if (this.x <= r.x && this.x + this.width >= r.x + r.width) {
            System.out.println("가로는 합격");
            //return true;
        } else {
            System.out.println("가로는 불합격");
            //return false;
        }
        if (this.y >= r.y && this.y - this.height >= r.y - r.height) {
            System.out.println("세로는 합격");
            //return true;
        } else {
            System.out.println("세로는 불합격");
            //return false;
        }

        return true;
    }

}
public class Am2 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        //if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
