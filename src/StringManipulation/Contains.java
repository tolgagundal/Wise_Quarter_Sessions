package JavaTeam;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir mail giriniz.");
        String girilenMail = input.next();

        System.out.println(girilenMail.indexOf("a"));


        if (!girilenMail.contains("@")) {
            System.out.println("gecersiz mail");
        } else if (!girilenMail.contains("@gmail.com")) {
            System.out.println("gecerli bir gmail giriniz");
        } else if (!girilenMail.endsWith("@gmail.com")) {
            System.out.println("mailde yazım hatası var");
        }


    }
}
