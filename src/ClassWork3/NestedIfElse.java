package ClassWork3;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        int i = 1, j = 20, k = 20, a = 3, b = 0, c = 4, d = 7;

        if (i == 10) {
            if (j < 20) a = b;
            if (k > 100) c = d;
            else a = c;
        }
        else a = d;
        System.out.println(a);
    }

    public static class SCops {
        public static void main(String[] args) {
            int n, d, q;
            d = q = 100;

            n = 10;
            d = 2;

            if (d != 0 && (n%d) == 0)
                System.out.println(d + " является делителем " + n);

            q = 0;
            if (q != 0 && (n%d) == 0)
                System.out.println(d + " является делителем " + n);

        }
    }

    public static class StringOperations {
        public static void main(String[] args) {
            String hi = "Hello";
            String name;

            Scanner input = new Scanner(System.in);
            System.out.println("What's your name?");
            name = input.nextLine();

            System.out.println(hi + " " + name);
            System.out.println("You are in " + 2022 + " year");
            System.out.println("The result of a sum of 2 and 3 is " + (2+3));
        }
    }
}
