package JavaTeam;

import java.util.Scanner;

public class IndexOf2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle giriniz.");

        String cumle = input.nextLine();

        int cokIndex = cumle.indexOf("cok");
        int boslukIndex = cumle.indexOf(" ", cokIndex);

        System.out.println(cumle.substring(cokIndex, boslukIndex));






    }

    }

