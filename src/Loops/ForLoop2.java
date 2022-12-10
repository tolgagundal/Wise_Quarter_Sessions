package JavaTeam.Loops;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İki değer giriniz");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int count = 0;
        int sum=0;

        for (int i = num1; i < num2; i+=7) {
            count++;
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("toplam: " + sum);
        System.out.print(count);
    }
}
