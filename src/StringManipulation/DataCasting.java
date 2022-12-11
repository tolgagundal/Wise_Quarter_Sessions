package JavaTeam;

import java.util.Scanner;

public class DataCasting {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        double average = (double) (num1 + num2 + num3) / 3;
        System.out.println("3 sayinin ortalaması: " + average);


    }
}
