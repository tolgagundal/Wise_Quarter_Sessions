package JavaTeam.StringManipulation;

public class ReplaceAll {
    public static void main(String[] args) {
        String str = "Ja1va 56Guz, zel-dir";
        // Sayılardan kurtul
        System.out.println(str.replace("1", "").replace("5", "").replace("6", ""));


        // Bu genellemeleri yazabilmek için regex (regular expressions)


        str = str.replaceAll("\\d", "");
        System.out.println(str);

        System.out.println(str.replaceAll("\\W", "")); // \\W harf veya rakam olmayan her şeyi kaldır.
        str = str.replaceAll(" ", "5");

        String input2 = "Java Masa , Araba";
        input2 = input2.replaceAll("\\W", "");
        System.out.println(input2.length());

        input2 = input2.replaceFirst("J", "j");
        System.out.println(input2);


    }
}
