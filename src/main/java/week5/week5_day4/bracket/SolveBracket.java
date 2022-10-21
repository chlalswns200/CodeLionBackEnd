package week5.week5_day4.bracket;

public class SolveBracket {
    boolean solution(String s) {

        while (s.indexOf("()") >= 0) {
            s = s.replace("()","");
        }

        return s.length() == 0;
    }
    public static void main(String[] args) {

    }
}
