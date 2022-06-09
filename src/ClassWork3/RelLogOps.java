package ClassWork3;

import java.util.Scanner;

public class RelLogOps {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;
        i = 10;
        j = 11;
        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("Не будет выполнено");
        if (i >= j) System.out.println("Не будет выполнено");
        if (i > j) System.out.println("Не будет выполнено");

        b1 = true;
        b2 = false;

        if (b1 & b2) System.out.println("Не будет выполнено");
        if (!(b1 & b2)) System.out.println("!(b1 & b2): true");
        if (b1 | b2) System.out.println("b1 | b2: true");
        if (b1 ^ b2) System.out.println("b1 ^ b2: true");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter birthday date: ");
        int birthday = input.nextInt();

        System.out.println("Enter if promo is running");
        boolean isPromo = input.nextBoolean();

        int currendate = 11;

        if ((currendate == birthday) & isPromo) System.out.println("Не будет бонуса");
        if ((currendate == birthday) & !isPromo) System.out.println("будет бонус");
        if (!(currendate == birthday) & !isPromo) System.out.println("сегодня не день рождения");
        if (!(currendate == birthday) & isPromo) System.out.println("сегодня не день рождения, но сегодня акция");
    }

    public static class Hypotenuse {

        public static void main(String[] args) {

            double x, y, z;

            x = 3.3;
            y = 4.9;

            z = Math.sqrt(x * x + y * y);
            System.out.println("ClassWork3.RelLogOps.Hypotenuse is equal with " + z);
        }
    }
}
