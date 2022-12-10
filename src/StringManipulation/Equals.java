package JavaTeam;

public class Equals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String ("Java");
        String str4 = "JAVA";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));

        String str = "Java güzeldir.";
        System.out.println(str.substring(2));
        System.out.println(str.substring(0));
        System.out.println(str.charAt(5));
    }
}
