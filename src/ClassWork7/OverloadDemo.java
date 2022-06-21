package ClassWork7;

public class OverloadDemo {
    public static void main(String[] args) {

        Overload ob = new Overload();

        int resI;
        int a = 0;
        int k = 3;
        double resD;
        double c = 8;
        double e = -78;
        float b = 5f;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(a);
        ob.ovlDemo(c, e);
        resI = ob.ovlDemo(b);
        System.out.println(resI);

        ob.ovlDemo(7);
        ob.ovlDemo(2.1, 9.56);
        resI = ob.ovlDemo(7f);
        System.out.println(resI);
    }
}
