package week5.week5_day2;

public class Square {

    public void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printRectangle(int x,int y) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Square sq = new Square();
        sq.printSquare(4);

        sq.printRectangle(5,3);

    }
}
