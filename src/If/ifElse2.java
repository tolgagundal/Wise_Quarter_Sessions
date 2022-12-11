package JavaTeam.If;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi (Erkek için 0, Kadın için 1)");
        int cinsiyet = input.nextInt();

        System.out.println("Yaşınızı girin");
        int yas = input.nextInt();

        if (cinsiyet == 0) {
            if (yas >= 65) {
                System.out.println("Emekli oldun adamım");
            } else {
                System.out.println("Emekli olmak için " + (65 - yas) + " yıl daha çalışmalısın.");
            }
        } else if (cinsiyet == 1) {
            if (yas >= 60) {
                System.out.println("Emekli oldun");
            } else {
                System.out.println("Emekli olmak için " + (60 - yas) + " yıl daha çalışmalısın.");
            }
        }
        System.out.println();
    }
}

