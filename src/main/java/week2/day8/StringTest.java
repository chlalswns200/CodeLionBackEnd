package week2.day8;

public class StringTest {
    public static void main(String[] args) {

        String a = "hello world";
        String b = new String("hello world");

        if (a == b) {
            System.out.println("두 문자열은 같습니다.");
        } else{
            System.out.println("두 문자열은 다릅니다.");
        }





        if (a.equals(b)) {
            System.out.println("두 문자열은 같습니다.");
        }
        
    }


}
