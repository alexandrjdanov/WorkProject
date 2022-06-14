package ClassWork5;

public class ParamDemo {
    public static void main(String[] args) {
        CheckNumber e = new CheckNumber();

        if (e.isEven(10)) System.out.println("10 - is even number");
        if (e.isEven(9)) System.out.println("9 - is even number");
        if (e.isEven(8)) System.out.println("8 - is even number");
        System.out.println();
        if (e.isDivider(10, 2)) System.out.println("2 is divider of 10");
        if (e.isDivider(11, 4)) System.out.println("4 is divider of 11");
        if (e.isDivider(2, 20)) System.out.println("20 is divider of 2");
    }
}
