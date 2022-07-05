package ClassWork9.overriding;

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i & j: " + i + " " + j);
    }

    int sumParameters() {
        return i + j;
    }

    final void method() {
        System.out.println("This is a final method.");
    }
}
