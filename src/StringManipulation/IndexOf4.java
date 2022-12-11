package JavaTeam;

public class IndexOf4 {
    public static void main(String[] args) {

        String str = "Javayı ögrenmek icin cok calismam lazim cok";

        // cok kelimesinin kullanımını kontrol et
        // - cok kelimesi kullanılmamış
        // - bir kere kullanılmış
        // - birden fazla kullanulmış

        int ilkCokIndexi = str.indexOf("cok");
        int sonCokIndexi = str.lastIndexOf("cok");

        if (!str.contains("cok")) {
            System.out.println("yok");
        } else if (ilkCokIndexi == sonCokIndexi) {
            System.out.println("Bir tane cok var");
        } else {
            System.out.println("birden fazla cok var");
        }


    }
}
