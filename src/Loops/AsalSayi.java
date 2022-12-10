package JavaTeam.Loops;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {

        int sayi = 31;
        String sonuc = "Sayi asal";

        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0) {
                sonuc= "Sayi asal degil";

               // break;
                // Java, bir loop'un içerisinde "break" gorurse o loop biter.
            }
        }
        System.out.println("asal sayi değildir");
    }
}
