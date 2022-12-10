package JavaTeam;

import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "Java ile kodlama cok guzel";

        int ilkOindexi =str.indexOf("o");
        int ikinciOindexi = str.indexOf("o",ilkOindexi+1);
        System.out.println(ilkOindexi + " ve " + ikinciOindexi);
    }
}
