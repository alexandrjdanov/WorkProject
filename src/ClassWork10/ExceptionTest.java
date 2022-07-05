package ClassWork10;

import java.util.Scanner;

public class ExceptionTest {
    static void generateExc() {
        int nums[] = new int[4];
        System.out.println("Enter index");

        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        System.out.println("This should not be printed");
    }

    public static void main(String[] args) {
        try {
            generateExc();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("You are out of the bound of the array!");
        }
    }
}
