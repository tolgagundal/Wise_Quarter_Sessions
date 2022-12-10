package JavaTeam.If;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir karakter giriniz.");
        char karakter= input.next().charAt(0);

        if (karakter >= 'a' && karakter <= 'z') {
            System.out.println((char) (karakter-32));
            System.out.println(Character.toUpperCase(karakter));
        } else {
            System.out.println(karakter);
        }
    }
}
