package week10.week10_day1;

import java.util.ArrayList;
import java.util.List;

public class ListSum {

    private static int sum(List<Integer> nums) {

        if(nums.isEmpty()) return 0;
        int remove = nums.remove(nums.size() - 1);
        return remove + sum(nums);
    }


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);

        int sum = sum(nums);
        System.out.println(sum);
    }

}
