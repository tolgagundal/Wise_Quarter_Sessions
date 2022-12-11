package JavaTeam;

import java.util.Scanner;

public class VariableScanner {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        float num2 = input.nextFloat();
        double num3 = input.nextDouble();

        System.out.println(num1 + " is a int " + num2 + " is a float (6-7 digits) " + num3 + " is a double ( 15-16 digits");

        System.out.println("Enter your name, surname and age");
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String surname;
        surname = scan.nextLine();
        int age = scan.nextInt();
        System.out.print("Isminiz: " + name +
                " Soyisminiz: " + surname +
                " Yasınız: " + age +
                " kaydınız başarıyla tamamlanmıştır.");
    }
}
