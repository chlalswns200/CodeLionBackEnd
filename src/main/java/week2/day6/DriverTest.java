package week2.day6;

interface Printable {// ms가 정의하고 제공한 인터페이스
    public abstract void print (String document);

    //인터페이스에는 추상함수만 올 수 있다
}

class SprinterDriver implements Printable {

    @Override
    public void print(String doc) {
        System.out.println("삼성 프린터 입니다.");
        System.out.println(doc);
    }
}

class LPrinterDriver implements Printable {

    @Override
    public void print(String doc) {
        System.out.println("LG 프린터 입니다.");
        System.out.println(doc);
    }
}

public class DriverTest {
    public static void main(String[] args) {
        Printable prn = new SprinterDriver();

        prn.print("출력해주세요.");

        prn = new LPrinterDriver();

        prn.print("출력해주세요.");

    }
}
