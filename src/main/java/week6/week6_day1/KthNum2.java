package week6.week6_day1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthNum2 {
    private int[] arr = {};

    public KthNum2(int[] arr) {
        this.arr = arr;
    }

    public int getKthNum(int[] command) {

        int frIdx = command[0];
        int toIdx = command[1];
        int nth = command[2];
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = frIdx-1; i < toIdx ; i++) {
            pq.add(arr[i]);
        }

        for (int i = 0; i < nth; i++) {
            result = pq.poll();
        }
        return result;
    }

    public int[] solution( int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        KthNum2 kns = new KthNum2(arr);
        int[] answer = kns.solution(commands);
        System.out.println(Arrays.toString(answer));


    }
}
