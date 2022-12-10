package JavaTeam;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        System.out.println("Enter yaricap");
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double cevre = 2 * Math.PI * r;
        double alan = Math.PI * r * r;
        System.out.println("Cemberin cevresi: " + cevre + " alani: " + alan);
    }
}
