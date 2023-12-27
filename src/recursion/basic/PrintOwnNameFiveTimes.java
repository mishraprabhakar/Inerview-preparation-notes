package recursion.basic;

public class PrintOwnNameFiveTimes {

    public static void main(String[] args) {

        printName("Prabhakar Mishra", 5);
        print1ToN(8);
        printNTo1(8);
    }

    private static void printNTo1(int i) {

        if (i < 1) {
            return;
        }

        System.out.println(i);
        printNTo1(i - 1);
    }

    private static void print1ToN(int i) {

        if (i < 1) {
            return;
        }
        print1ToN(i - 1);
        System.out.println(i);
    }

    private static void printName(String str, int i) {

        if (i < 1) {
            return;
        }
        System.out.println(str);
        printName(str, i-1);

    }
}
