package week8.week8_day1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11};

        int targetNum = 7;
        // 중간값 찾기
        int midNumIdx = nums.length/2;
        int startIdx = 0;
        int endIdx = nums.length-1;

        // 인덱스(시작점,끝점) 옮기기
        if (nums[midNumIdx] < targetNum) {
            endIdx = midNumIdx - 1;
        } else if(nums[midNumIdx]>targetNum) {
            startIdx = midNumIdx+1;
        } else {
            System.out.println(midNumIdx);
        }

    }
}
