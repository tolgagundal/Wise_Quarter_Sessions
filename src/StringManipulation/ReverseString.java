package JavaTeam;

import jdk.nashorn.internal.objects.NativeString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz.");
        String str = input.nextLine();
        reverse(str);


    }

    public static void reverse(String ifade) {
        for (int i = ifade.length() - 1; i >= 0; i--) {
            // System.out.print(ifade.charAt(i));
            System.out.print(ifade.substring(i, i + 1));

        }

    }
}

