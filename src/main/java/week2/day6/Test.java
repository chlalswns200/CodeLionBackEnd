package week2.day6;

class MobilePhone {
    protected String number;

    public MobilePhone(String num) {
        number = num;
    }

    public void answer(){
        System.out.println("Hi~from " + number);
    }
}

class SmartPhone extends MobilePhone{
    private String androidVer;

    public SmartPhone(String num, String ver) {
        super(num);
        androidVer = ver;
    }

    public void playApp() {
        System.out.println("App is running in " + androidVer);
    }

}
public class Test {
    public static void main(String[] args) {
        SmartPhone ph1 = new SmartPhone("010-555-7777", "Nougat");
        MobilePhone ph2 = new SmartPhone("010-999-3333", "Nougat");

        ph1.answer(); //Hi~from 010-555-7777
        ph1.playApp(); //App is running in Nougat
        System.out.println();

        ph2.answer(); //Hi~from 010-999-3333
        //ph2.playApp(); //컴파일 에러

        //사용 예
        if (ph1 instanceof SmartPhone) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        } // "TRUE" 출력

        if (ph2 instanceof SmartPhone) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        } // "TRUE" 출력 ?? 왜?

        if (ph2 instanceof MobilePhone) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        } // "TRUE" 출
    }


}
