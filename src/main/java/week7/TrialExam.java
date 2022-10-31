package week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TrialExam {
    public int[] solution(int[] answers) {

        int[] answer = {};
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        int score1 = 0, score2 = 0, score3 = 0;

        for(int i = 0; i < answers.length; i++){
            if(a[cnt1++] == answers[i]){
                score1++;
            }
            if(b[cnt2++] == answers[i]){
                score2++;
            }
            if(c[cnt3++] == answers[i]){
                score3++;
            }
            if(cnt1 == a.length){
                cnt1 = 0;
            }
            if(cnt2 == b.length){
                cnt2 = 0;
            }
            if(cnt3 == c.length){
                cnt3 = 0;
            }
        }

        int max = 0;
        ArrayList<Integer> al = new ArrayList<>();
        max = Math.max(max, Math.max(score1, Math.max(score2, score3)));

        if(score1 == max){
            al.add(1);
        }
        if(score2 == max){
            al.add(2);
        }
        if(score3 == max){
            al.add(3);
        }

        Collections.sort(al);
        answer = al.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static void main(String[] args) {

        int arr[] = {1,3,2,4,2};
        TrialExam tr = new TrialExam();
        int[] solution = tr.solution(arr);

        System.out.println(Arrays.toString(solution));
    }
}
