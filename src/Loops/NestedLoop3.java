package JavaTeam.Loops;

public class NestedLoop3 {
    public static void main(String[] args) {

        /*
        input degerine kadar her satirda * sayisinin bir arttip sonra azaltarak asagidaki sekli yazdırın.

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

         */

        int input = 4;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
        for (int i = input - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }


    }
}
