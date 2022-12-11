package JavaTeam.Loops;

public class ForLoop3 {
    public static void main(String[] args) {
        int input = 13;
        int carpim = 1;

        for (int i = input; i >= 1; i--) {
            carpim *= 1;
        }
        System.out.println("verilen " + input + " sayisinin faktoriyeli: " + carpim);
    }
}
