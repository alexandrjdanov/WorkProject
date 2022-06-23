package ClassWork8;

public class VariableNumberOfArguments {

    static void varNumArgTest(int ... v) {
        System.out.println("Number of arguments: " + v.length);
        System.out.println("Values: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("Arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void varNumArgTest(double ... v) {
        System.out.println("Number of arguments: " + v.length);
        System.out.println("Values: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("Arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void varNumArgTest(String ... v) {
        System.out.println("Number of arguments: " + v.length);
        System.out.println("Values: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("Arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void varNumArgTest2(int n, int ... v) {
        System.out.println("Number of arguments: " + v.length);
        System.out.println("Values: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("Arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varNumArgTest2(10);
        varNumArgTest(10, 20, 30);
        varNumArgTest("White", "Yellow", "Orange");
    }
}
