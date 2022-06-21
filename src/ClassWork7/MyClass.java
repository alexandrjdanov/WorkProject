package ClassWork7;

public class MyClass {
    private int alpha;
    public int beta;
    int gamma;

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }

    @Override
    public String toString() {
        return "MyClass {" +
                "alpha = " + alpha +
                ", beta = " + beta +
                ", gamma = " + gamma +
                '}';
    }
}
