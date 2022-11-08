package week7.week7_day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMultipleOf {


    public static void main(String[] args) {
        int N = 50; // 50미만의 모든 소수를 구합니다.

        List<Integer> nums = new ArrayList<>();
        boolean[] checks = new boolean[N];

        // 2 ~ 50채우기
        int cnt=0;
        for (int i = 2; i <= N; i++) nums.add(i);

        for (int j = 2; j * j <= N; j++) {
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) % j == 0 && nums.get(i) > j){
                    checks[i]=true;
                }

            }
        }

        for (int i = 0; i < nums.size(); i++) {
            if (checks[i] == false) {
                System.out.print(" "+nums.get(i));
            }
        }

        // System.out.println(nums);
    }
}
