package JavaTeam.Loops;

public class NestedLoops2 {
    public static void main(String[] args) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
         */

        // Kac satır olacagini outer loop (1-4 arası)
        int input = 4;

        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i; j++) {


                System.out.print(j + " ");
            }


            System.out.println("");

        }

    }

}
