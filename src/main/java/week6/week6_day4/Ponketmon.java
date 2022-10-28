package week6.week6_day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ponketmon {

    //List로 풀기
    public int solutionA(int[] nums) {
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

    //Set으로 풀기
    public int solutionB(int[] nums) {

        int answer = 0;
        int maxCount = nums.length/2;
        Set<Integer> intSet = new HashSet<>();

        for (int i : nums) {
            intSet.add(i);
            if (intSet.size() == maxCount) {
                return intSet.size();
            }
        }

        return intSet.size();
    }

    public static void main(String[] args) {

        int ar[] = {3,3,3,2,2,2};
        Ponketmon pk = new Ponketmon();
        int solutionA = pk.solutionA(ar);
        int solutionB = pk.solutionB(ar);

        System.out.println("solutionA = " + solutionA);
        System.out.println("solutionB = " + solutionB);
    }
}
