package week7.week7_day4;


import net.minidev.json.JSONUtil;

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

        for (int j = 0; j * j <= N; j++) {
            int multipleOf = nums[j];
            for (int i = nums[j] + j; i < nums.length; i+=multipleOf) {
                checks[i] = false;
            }
        }

        int cnt = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]) cnt++;
        }
        System.out.println(" "+cnt);
    }


}
