package JavaTeam.Loops;

import java.util.Scanner;

public class ForLoop5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir pozitif deger giriniz.");
        int sayi = input.nextInt();

        for (int i = 1; i < sayi; i++) {

            if(i%3==0 && i%5==0) {
                System.out.print(" fizzBuzz ");
            } else if (i %5 ==0) {
                System.out.print(" buzz ");

            } else if (i %3 ==0) {
                System.out.print("  lizz  ");
            } else System.out.print(i + " ");

        }

    }
}
