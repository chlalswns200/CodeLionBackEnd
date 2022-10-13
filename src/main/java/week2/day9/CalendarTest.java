package week2.day9;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int hour24 = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);

        System.out.println("현재 시간은 " + hour24+"시 "+minute+"분 입니다.");

        if (hour24 > 4 && hour24 < 12) {
            System.out.println("Good Morning");
        } else if (hour24 < 18) {
            System.out.println("Good Afternoon");
        } else if (hour24 < 22) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }

    }
}
