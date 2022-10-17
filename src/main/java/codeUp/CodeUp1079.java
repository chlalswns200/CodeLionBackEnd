package codeUp;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.replaceAll(" ","" );
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.printf("%c\n" ,c);
            if (c == 'q') {
                break;
            }
        }
    }
}