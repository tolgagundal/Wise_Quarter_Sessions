package JavaTeam.Loops;

import java.util.Locale;
import java.util.Scanner;

public class ForLoop4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java Cok Guzel";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.substring(i, i + 1).toUpperCase());
            } else {
                System.out.print(str.substring(i, i + 1).toLowerCase());
            }

        }
    }
}
