package week6.week6_day4;

import java.util.ArrayList;
import java.util.List;

public class Ponketmon {

    public int solution(int[] nums) {
        int answer = 0;
        int maxCount = nums.length/2;
        List<Integer> intList = new ArrayList<>();

        for (int i : nums) {
            int inPokemon = 0;
            for (Integer j : intList) {
                if (i == j) {
                    inPokemon = 1;
                }
            }
            if (inPokemon == 0) {
                intList.add(i);
            }
            if (intList.size() == maxCount) {
                return intList.size();
            }
        }

        return intList.size();
    }

    public static void main(String[] args) {

        int ar[] = {3,3,3,2,2,2};
        Ponketmon pk = new Ponketmon();
        int solution = pk.solution(ar);
        System.out.println("solution = " + solution);
    }
}
