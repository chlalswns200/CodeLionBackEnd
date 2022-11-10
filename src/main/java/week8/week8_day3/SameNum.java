package week8.week8_day3;

import java.util.*;

public class SameNum {
    public static void main(String[] args) {
        SameNum sn = new SameNum();
        int[] arr = new int[]{1,1,3,3,0,1,1};
        int[] solution = sn.solution2(arr);
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

    public int[] solution2(int []arr) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if (stack.peek() != arr[i]) {
                    stack.push(arr[i]);
                }
            }
        }
        int size = stack.size();
        int[] answer = new int[size];
        int j=0;
        while (!stack.isEmpty()) {
            answer[j] = stack.pop();
            j++;
        }
        for( int i=0; i < (answer.length/2); i++) {
            int temp = answer[i];
            answer[i] = answer[answer.length-i-1];
            answer[answer.length-i-1] = temp;
        }
        return answer;
    }
}
