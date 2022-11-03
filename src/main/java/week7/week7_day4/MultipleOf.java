package week7.week7_day4;


import java.util.Arrays;

public class MultipleOf {

    public static void main(String[] args) {

        int N = 50;
        int[] nums = new int[N - 1];
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks,true);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+2;
        }
        System.out.println(Arrays.toString(nums));
    }

}
