package JavaTeam.Switch;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen s ve i harflerinden birini giriniz.");
        char harf = input.next().charAt(0);

        switch (harf) {
            case 'i':
            case 'I':
                System.out.println("International");
                break;
            case 's':
            case 'S':
                System.out.println("Software");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz.");


        }
    }
}
