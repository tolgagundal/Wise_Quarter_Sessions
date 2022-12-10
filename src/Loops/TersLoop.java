package JavaTeam.Loops;

public class TersLoop {
    public static void main(String[] args) {
        String str = "Java calismak icin cok calismak lazim";

        String terstenStr = "";

        for (int i = str.length()-1; i >= 0 ; i--) {

            terstenStr += str.substring(i,i+1);

        }
        System.out.println("Tersten yazilisi: " + terstenStr);

    }
}
