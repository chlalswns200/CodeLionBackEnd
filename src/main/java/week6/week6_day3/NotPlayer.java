package week6.week6_day3;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class NotPlayer {

    public String solutionA(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for(i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                return answer;
            }
        }
        answer = participant[i];
        return answer;
    } // 해시 없이 푼거

    public String solution(String[] participant, String[] completion) {

        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        Hashtable<String,Integer> ht = new Hashtable<>();

        for (int i = 0; i < participant.length; i++) {
            ht.put(participant[i],i);
        }

        for (int i = 0; i < completion.length; i++) {
            ht.replace(completion[i],-1);
        }

        for (String s : ht.keySet()) {
            if (ht.get(s) > 0) {
                return s;
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"eden", "kiki"};
        
        NotPlayer nt = new NotPlayer();
        String solution = nt.solution(participant, completion);
        System.out.println("solution = " + solution);


    }
}
