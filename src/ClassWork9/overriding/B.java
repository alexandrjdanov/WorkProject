package ClassWork9.overriding;

public class B extends A{
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("k: " + k);
    }

    int sumParameters(int l) {
        return (i + j + k)/l;
    }

//    void method() {
//        System.out.println("Not allowed");
//    }
}
