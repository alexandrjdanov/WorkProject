public class SideEffects {
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
