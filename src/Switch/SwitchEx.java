package JavaTeam.Switch;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi giriniz.");
        int num1 = input.nextInt();
        char islem = input.next().charAt(0);
        int num2 = input.nextInt();

        switch (islem) {
            case '+':
                System.out.println("Sayıların toplamı: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Sayıların farkı: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Sayıların çarpımı: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Sayıların bölümü: " + (num1 / num2));
                break;
            default:
                System.out.println("Yanlış işlem yaptınız.");
        }
    }
}
