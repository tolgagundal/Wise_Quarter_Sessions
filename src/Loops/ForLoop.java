package JavaTeam.Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İki değer giriniz");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int count = 0;

        for (int i = num1; i <= num2; i++) {

            if (i % 5 == 0) {
                System.out.println("Beşin katı olan sayılar: " + i);
                count++;
            }
        }
        System.out.println(count);

    }
}
