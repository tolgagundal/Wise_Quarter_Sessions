package JavaTeam;

import java.util.Scanner;

public class DataCasting2 {
    public static void main(String[] args) {
        System.out.println("Bir harf yazin");
        Scanner input = new Scanner(System.in);

        char harf = input.next().charAt(0);

        for (int i = 1; i < 4; i++) {
           char harfS= (char) (harf + i);

            System.out.println(harfS);

        }




    }
}
