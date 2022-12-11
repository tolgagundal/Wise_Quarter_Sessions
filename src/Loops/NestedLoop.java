package JavaTeam.Loops;

public class NestedLoop {
    public static void main(String[] args) {
        // input olarak verilen kenar uzunluklarına gore asagidaki sekli ciz

        int kisaKenar = 5;
        int uzunKenar = 8;

        /*

            * * * * * * * * // bir satiri nasıl yazdıracaımızı inner loop ile belirleriz
            * * * * * * * *
            * * * * * * * *
            * * * * * * * *

            Satirda yaptıgimiz islemi kac kere tekrar edecegimizi ise outer loop belirler
         */

        for (int i = 1; i <= kisaKenar; i++) {

            for (int j = 1; j <= uzunKenar; j++) {
                System.out.print("* ");
            }
            System.out.println(""); // Alt satira gecmek icin. (Hiclik)

        }

    }
}
