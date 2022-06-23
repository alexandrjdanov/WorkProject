package ClassWork8;

public class B extends A{
    int i;
    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i from SuperClass " + super.i);
        System.out.println("i from SubClass " + i);
    }
}
