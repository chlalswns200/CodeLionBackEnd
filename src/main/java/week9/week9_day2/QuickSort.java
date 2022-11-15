package week9.week9_day2;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right) {
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);

        return answer;
    }

    public List<Integer> sort(List<Integer> arr) {

        if(arr.size() <=1) return arr;

        int pivot = arr.get(arr.size()/ 2);
        System.out.println(pivot);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if(pivot>arr.get(i)) left.add(arr.get(i));
            else if(pivot<arr.get(i)) right.add(arr.get(i));
            else mid.add(arr.get(i));
        }
        System.out.println(left);
        System.out.println(right);

        return merge(sort(left) ,mid , sort(right));
    }
    public static void main(String[] args) {
        int[] arr = new int[]{ 20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        QuickSort qs = new QuickSort();
        List<Integer> sort = qs.sort(al);
        System.out.println("sort = " + sort);


    }
}
