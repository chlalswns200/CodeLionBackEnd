package week3.week3_day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hello {

    public static void main(String[] args) {

        List<Integer> listA = new ArrayList<>();

        listA.add(1);
        listA.add(1);
        listA.add(1);

        listA.add(2);
        listA.add(3);

        System.out.println("listA = " + listA);
        Set<Integer> setA = new HashSet<>(listA);
        System.out.println("setA = " + setA);
        //$ git push origin +master
    }
}

