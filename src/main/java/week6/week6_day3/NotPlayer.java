package week6.week6_day3;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

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

        Map<String,Integer> ht = new Hashtable<>();

        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];

            if (!ht.containsKey(key)) {
                ht.put(key,0);
            }
            ht.put(key,ht.get(key)+1);
        }

        for (int i = 0; i < completion.length; i++) {
            ht.replace(completion[i],ht.get(completion[i]) - 1);
        }

        for (String s : ht.keySet()) {
            if (ht.get(s) == 1) {
                return s;
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        
        NotPlayer nt = new NotPlayer();
        String solution = nt.solution(participant, completion);
        System.out.println("solution = " + solution);


    }
}
