package week8.week8_day1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11};

        int targetNum = 7;
        // 중간값 찾기
        int midNumIdx = nums.length/2;

        int startIdx;
        int endIdx;
        // 인덱스(시작점,끝점) 옮기기
        if (nums[midNumIdx] < targetNum) {
            startIdx = midNumIdx + 1;
            endIdx = nums.length - 1;
        } else {
            startIdx = 0;
            endIdx = midNumIdx - 1;
        }
        midNumIdx = nums[(startIdx+endIdx)/2];


        // 같은지 비교하기
        if (nums[startIdx] == targetNum) System.out.println(startIdx);
        if(nums[endIdx]==targetNum) System.out.println(endIdx);

    }
}
