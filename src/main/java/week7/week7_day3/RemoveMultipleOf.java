package week7.week7_day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMultipleOf {
    public static void main(String[] args) {
        int N = 50;
        List<Integer> nl = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            nl.add(i);
        }
        int[] nums = {2,3,5,7};
        for (int i : nums) {
            nl.removeIf(num -> num % i == 0&& num==i);
        }

        System.out.println(Arrays.toString(nl.toArray()));
    }
}
