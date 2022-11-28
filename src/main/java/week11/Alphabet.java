package week11;

public class Alphabet {

    static void print1() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
        }
    }

    static void print2() {
        for (char c = 'A'; c <= 'Z'; c++) {
            for (char d = 'A'; d <= 'Z'; d++) {
                System.out.printf("%s %s\n", c, d);
            }
        }
    }

    public static void main(String[] args) {
        print1();
        print2();
    }

}
