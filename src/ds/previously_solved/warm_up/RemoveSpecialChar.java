package ds.previously_solved.warm_up;

public class RemoveSpecialChar {
    public static void main(String[] args) {

        String strWithSpecialChar = "fiajOJOSDOOJN3#$&(&^<>:(%)";

        String strWithoutSpecialChar = strWithSpecialChar.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(strWithoutSpecialChar);
    }
}
