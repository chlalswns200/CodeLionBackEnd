package week5.week5_day4.bracket;

import java.util.Stack;

public class SolveBracket {
    //indexOf 함수
    boolean solution(String s) {

        while (s.indexOf("()") >= 0) {
            s = s.replace("()","");
        }

        return s.length() == 0;
    }

    //split 함수
    boolean solution2(String s) {
        while (s.indexOf("()")>=0) {
            String[] split = s.split("\\(\\)");
            s = String.join("",split);
        }
        return s.length() == 0;
    }

    //stack으로 풀기
    boolean solution3(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ('(' == (s.charAt(i))) {
                st.push(s.charAt(i));
            } else if (')' == (s.charAt(i))) {
                if(st.empty()) return false;
                st.pop();
            }
        }
        return st.empty();
    }
}
