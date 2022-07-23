package ClassWork13;

public class GenDemo {
    public static void main(String[] args) {

        Gen<Integer> iOb;

        iOb = new Gen<>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Value of v: " + v);

        System.out.println();

        Gen<String> strOb = new Gen<>("Message testing");

        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Value of str: " + str);

        TwoGen<Integer, String> tgOb = new TwoGen<>(88, "Generics");
        tgOb.showTypes();

        int v1 = tgOb.getOb1();
        String str1 = tgOb.getOb2();
        System.out.println("Value of v1: " + v1);
        System.out.println("Value of str1: " + str1);
    }
}
