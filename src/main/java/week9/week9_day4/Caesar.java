package week9.week9_day4;

public class Caesar {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                if (c >= 'a' && c <= 'z') {
                    answer += (char)((c - 'a' + n) % 26 + 'a');
                } else {
                    answer += (char)((c - 'A' + n) % 26 + 'A');
                }
            } else {
                answer += (char)c;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Caesar cs = new Caesar();
        String s = "AB";
        String s2 = "z";
        String s3 = "a B z";
        String solution = cs.solution(s, 1);
        System.out.println("solution = " + solution);

        String solution2 = cs.solution(s2, 1);
        System.out.println("solution = " + solution2);

        String solution3 = cs.solution(s3, 4);
        System.out.println("solution = " + solution3);
    }
}
