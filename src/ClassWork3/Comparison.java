package ClassWork3;

import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter first integer: ");
        number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
        System.out.println(number1 == number2);

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
    }

    public static class DecrFor {
        public static void main(String[] args) {
            int x = 0;
            int count;
            int i, j;

            for (count = 10; count < 5; count++) {
                System.out.println(x);
            }

            for (i = 0, j = 10; i < j; i++, j--) {
                System.out.println("i & j: " + i + " " + j);
            }
        }
    }
}
