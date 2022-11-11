package week8.week8_day4;


public class Binary {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        answer = new String[n];

        for (int i = 0; i < n; i++) {
            String s = Integer.toBinaryString(arr1[i] | arr2[i]);
            if (s.length() < n) {
                s = "0".repeat(n-s.length()) + s;
            }
            String replace = s.replace("1", "#");
            String replace1 = replace.replace("0", " ");
            answer[i] = replace1;
        }

        return answer;
    }
    public static void main(String[] args) {

        int n = 6;
        int[] arr1 = new int[]{46, 33, 33 ,22, 31, 50};
        int[] arr2 = new int[]{27 ,56, 19, 14, 14, 10};

        Binary br = new Binary();
        String[] solution = br.solution(n, arr1, arr2);

        for (String s : solution) {
            System.out.println(s);
        }


    }
}
