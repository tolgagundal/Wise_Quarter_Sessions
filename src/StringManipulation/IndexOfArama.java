package JavaTeam;

public class IndexOfArama {
    public static void main(String[] args) {

        // Web sayfasında String arama sonuclarında arama sayısının 50'den fazla olduğunu test edin.

        String input = "1-48 of 87 results for  \"nutella\"";

        int indexOf = input.indexOf("of");
        int indexResult = input.indexOf("results");

        String sonucSayisiString = input.substring(indexOf + 3, indexResult);
        System.out.println(sonucSayisiString.trim());

    }
}
