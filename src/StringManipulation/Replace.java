package JavaTeam.StringManipulation;

public class Replace {
    public static void main(String[] args) {
        String sonuc = "1-16 of over 100,000 results for \"apple\" ";

        int overIndex = sonuc.indexOf("over"); // 8
        int resultsIndex = sonuc.indexOf("results");

        String adet = sonuc.substring(overIndex + 5, resultsIndex-1).trim();

        System.out.println("adet:" + adet);

        adet =adet.replace(",", "");

        int sonucSayisi = Integer.parseInt(adet);

        if (sonucSayisi>100000) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }


    }
}
