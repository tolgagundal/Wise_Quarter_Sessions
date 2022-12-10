package JavaTeam.StringManipulation;

public class Password {
    public static void main(String[] args) {

        String sifre = "abc1453";
        int flag=0;
        // İlk harf kucuk harf olmalı

        if (sifre.charAt(0) > 'a' && sifre.charAt(0) <= 'z') {
            System.out.println("İlk harf kücük olmalı");
            flag++;
        }

        //Sifre bosluk icermemeli

        if (!(sifre.contains(""))) {
            System.out.println("Bosluk icermemeli");
            flag++;
        }

        // son karakter rakam olmalı

        if (!(sifre.charAt(sifre.length()-1) >= 0 && sifre.charAt(sifre.length()-1) <=9)) {
            System.out.println("Son karakter rakam olmalı");
            flag++;
        }
        if (flag == 0) {
            System.out.println("Doğru şifre oluşturuldu.");
}
    }
}
