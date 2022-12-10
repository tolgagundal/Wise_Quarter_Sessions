package JavaTeam.Switch;

import java.util.Scanner;

//Switch parantezine double, long, float ve boolean kullanılmaz.
//default: else gibi kullanılır.

public class SwitchEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1 ile 7 arasında bir değer giriniz.");
        int gunNo = input.nextInt();

        switch (gunNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Yanlış değer girdiniz.");
        }

    }
}
