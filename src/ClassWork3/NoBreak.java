package ClassWork3;

import java.util.Scanner;

public class NoBreak {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is lower than 1");
                case 1:
                    System.out.println("i is lower than 2");
                case 2:
                    System.out.println("i is lower than 3");
                case 3:
                    System.out.println("i is lower than 4");
                case 4:
                    System.out.println("i is lower than 5");
                default:
                    System.out.println("default operator");
            }
            System.out.println();
        }
//        int z = 2;
//        switch (z) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Будний день");
//                break;
//            case 6:
//            case 7:
//                System.out.println("выходной");
//                break;
//            default:
//                System.out.println("Это не день недели");
//        }

//        char ch1 = 'A';
//        char ch2 = 'A';
//
//        switch (ch1) {
//            case 'A':
//                System.out.println("Это раздел А внешнего оператора switch");
//                switch (ch2) {
//                    case 'A':
//                        System.out.println("Это раздел А внутреннего оператора switch");
//                        break;
//                    case 'B':
//                        System.out.println("Это раздел B внутреннего оператора switch");
//                        break;
//                }
//                break;
//            case 'B':
//                System.out.println("Это раздел B внешнего оператора switch");
//        }
    }

    public static class SideEffects {
        public static void main(String[] args) {
            int i;

            i = 0;

            if (false & (++i < 100))
                System.out.println("This string is not displayed");
            System.out.println("If operator is executed case 1: " + i);

            if (false && (++i < 100))
                System.out.println("This string is not displayed");
            System.out.println("If operator is executed case 2: " + i);

            int thisNumber = 0;

            if (true | false) System.out.println("1 This should be printed");
            if (true | (++thisNumber > 0)) System.out.println("2 This should be printed and thisNumber is " + thisNumber);
            if (true || (++thisNumber > 0)) System.out.println("3 This should be printed and thisNumber is " + thisNumber);
            if (true || false) System.out.println("4 This should be printed");
            if (true & false) System.out.println("5 This should NOT be printed");
            if (true & (++thisNumber > 0)) System.out.println("6 This should be printed BECAUSE thisNumber is " + thisNumber);
            if (true && false) System.out.println("7 This should NOT be printed");
            if (true && (++thisNumber > 0)) System.out.println("8 This should be printed BECAUSE thisNumber is " + thisNumber);
            if (true ^ false) System.out.println("9 This should be printed");
            if (!true) System.out.println("10 This should NOT be printed");
            if (!false) System.out.println("11 This should be printed");

            if (false | true) System.out.println("12 This should be printed");
            if (false | (++thisNumber > 0)) System.out.println("13 This should be printed BECAUSE thisNumber is " + thisNumber);
            if (false || true) System.out.println("14 This should be printed");
            if (false || (++thisNumber > 0)) System.out.println("15 This should be printed BECAUSE thisNumber is " + thisNumber);
            if (false & true) System.out.println("16 This should NOT be printed");
            if (false & (++thisNumber > 0)) System.out.println("17 This should NOT be printed");
            if (false && true) System.out.println("18 This should NOT be printed");
            if (false && true) System.out.println("19 This should NOT be printed");
            if (false ^ true) System.out.println("20 This should be printed");



        }
    }

    public static class UseCast {
        public static void main(String[] args) {
            int i;

            for (i = 0; i < 5; i++) {
                System.out.println(i + " / 3: " + i / 3);
                System.out.println(i + " / 3 с дробной частью:" + (double) i / 3 + "\n");
            }
        }
    }

    public static class VarInitDemo {
        public static void main(String[] args) {
            int x;

            for (x = 0; x < 3; x++) {
                int y = -1;
                System.out.println("y: " + y);
                y = 100;
                System.out.println("changed y: " + y);

            }
        }
    }

    public static class Sound {
        public static void main(String[] args) {
            int x = 343;
            double y = 7.2;
            double z = x * y;
            System.out.println("ClassWork3.NoBreak.Sound speed is equal with " + x + " meters per second");
            System.out.println("Time period is equal with " + y + " seconds");
            System.out.println("distance is equal with " + z + " meters");
        }
    }

    public static class Distance {
        public static void main(String[] args) {
            int x = 343; //speed
            double y, z; // y - time, z - distance

            System.out.println("ClassWork3.NoBreak.Sound speed is equal with " + x + " meters per second");
            Scanner input = new Scanner(System.in);
            System.out.println("In how much seconds the sound of echo returns after the clap: ");
            y = input.nextDouble();
            z = x * y / 2;
            System.out.println("ClassWork3.NoBreak.Distance to the rock is equal with " + z + " meters");
        }
    }
}