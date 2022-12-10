package JavaTeam.Loops;

import java.util.Scanner;

public class AradakiSayilarınTop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Baslangıc ve bitis degerleri icin iki pozitif deger giriniz.");

        int baslangic = input.nextInt();
        int bitis = input.nextInt();

        if (bitis < baslangic) {
                System.out.println("Yanlıs deger girdiniz");
            } else {
                int toplam = 0;
                for (int i = baslangic; i <= bitis; i++) {
                toplam += i;
            }
            System.out.println(baslangic + " ile " + bitis + " arasındaki degerlerin toplami: " + toplam);

        }
    }
}
