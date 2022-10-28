package week6.week6_day4;

import java.util.HashSet;

public class PhoneNumber {

    public boolean solution(String[] phone_book) {

        boolean answer = true;

        HashSet<String> set = new HashSet<>();

        for (var num : phone_book) set.add(num);

        for (String phone : phone_book) {

            for (int i = 0; i < phone.length(); i++) {

                if (set.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        System.out.println("12".indexOf("123"));



    }
}
