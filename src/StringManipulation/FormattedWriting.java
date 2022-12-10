package JavaTeam;

import java.util.Scanner;

public class FormattedWriting {
    public static void main(String[] args) {
        System.out.println("Enter your name, surname and age");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String surname = scan.nextLine();
        int age = scan.nextInt();
        System.out.println("girilen bilgiler: " + name.charAt(0) + " " + surname + ", " + age);

    }
}
