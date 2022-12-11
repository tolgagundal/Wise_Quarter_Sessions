package src.If;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BodyIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kilo ve boy giriniz");
        double kilo = input.nextDouble();
        double boy = input.nextDouble();
        double index = (kilo * 10000) / (boy * boy);
        if (index >= 30) {
            System.out.println("tebrikler obezsiniz");
        } else if (index > 25 && index < 30) {
            System.out.println("kilolu");
        } else if (index > 20 && index <= 25) {
            System.out.println("normal");
        } else {
            System.out.println("cıbık gibisiniz");

        }
    }
}
