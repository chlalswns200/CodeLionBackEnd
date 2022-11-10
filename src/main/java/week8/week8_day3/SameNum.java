package week8.week8_day3;

import java.util.ArrayList;
import java.util.List;

public class SameNum {
    public static void main(String[] args) {
        SameNum sn = new SameNum();
        sn.solution();
    }

     public int[] solution() {
        List<Integer> list = new ArrayList<>();
        int[] ar = new int[]{1,1,3,3,0,1,1};
        int i=0;
        while (i<ar.length) {
            int num = ar[i];
            while (num == ar[i]) {
                i++;
                if(i==ar.length) break;
            }
            list.add(num);
        }
         int size = list.size();

         return
    }
}
