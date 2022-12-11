package JavaTeam.StringManipulation;

public class Example {
    public static void main(String[] args) {
        String str = "Evden yurutuyorum, ise gitmeye gerek yok";

        String calisilacakStr = str.toLowerCase();

        if (calisilacakStr.contains("ev") && calisilacakStr.contains("is")) {
            System.out.println("hybrit");
        } else if (calisilacakStr.contains("ev")) {
            System.out.println("Home sweet home");
        } else if (calisilacakStr.contains("is")) {
            System.out.println("calismak iyi");
        } else {
            System.out.println("cok calis");
        }


    }
}
