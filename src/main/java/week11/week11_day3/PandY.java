package week11.week11_day3;

public class PandY {
    static boolean solution(String s) {
        boolean answer = true;
        int p=0;
        int y=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'P' || c == 'p') p++;
            if (c == 'Y' || c == 'y') y++;
        }
        if(p!=y) answer = false;
        return answer;
    }

    public static void main(String[] args) {
        boolean pPoooyY = solution("Pyy");
        System.out.println("pPoooyY = " + pPoooyY);
    }
}
