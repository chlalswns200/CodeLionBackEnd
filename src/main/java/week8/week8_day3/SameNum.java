package week8.week8_day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SameNum {
    public static void main(String[] args) {
        SameNum sn = new SameNum();
        int[] arr = new int[]{1,1,3,3,0,1,1};
        int[] solution = sn.solution(arr);
        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int num = arr[i];
            while (num == arr[i]) {
                i++;
                if (i == arr.length) break;
            }
            list.add(num);
        }
        int size = list.size();
        int[] answer = new int[size];
        int j=0;
        for (Integer integer : list) {

            answer[j] = integer;
            j++;
        }
        return answer;
    }
}
