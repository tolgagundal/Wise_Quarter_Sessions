package JavaTeam;

public class IndexOf3 {
    public static void main(String[] args) {
        // Web sayfasında String arama sonuclarında arama sayısının 50'den fazla olduğunu test edin.

        String input = "1-48 over 99 results for  \"nutella\"";

        int indexOver = input.indexOf("over");
        int indexResult = input.indexOf("results");

        String sonucString = input.substring(indexOver + 5, indexResult - 1);

        // Arama sayısının 50'den fazla olduğunu test et

        int sonucInt = Integer.parseInt(sonucString);

        if (sonucInt > 50) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

    }
}
