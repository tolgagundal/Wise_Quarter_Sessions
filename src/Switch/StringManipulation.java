package JavaTeam.Switch;

import java.util.Locale;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");
        String girilenGun = input.next();
        String kullanilacakGun = girilenGun.toLowerCase();

        switch (kullanilacakGun) {
            case "pazartesi":
                System.out.println(girilenGun + " calısma zamanı, tatile 5 gün var");
                break;
            case "sali":
                System.out.println(girilenGun + " calısma zamanı, tatile 4 gün var");
                break;
            case "carsamba":
                System.out.println(girilenGun + " calısma zamanı, tatile 3 gün var");
                break;
            case "persembe":
                System.out.println(girilenGun + " calısma zamanı, tatile 2 gün var");
                break;
            case "cuma":
                System.out.println(girilenGun + " calısma zamanı, tatile 1 gün var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Dinlenme zamanı");
                break;
            default:
                System.out.println("Yanlıs girdiniz");


        }
    }
}
