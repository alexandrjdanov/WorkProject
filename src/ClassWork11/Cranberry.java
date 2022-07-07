package ClassWork11;

public class Cranberry extends Berry{
    double sourness;
    final static String n = "Cranberry";

    Cranberry() {
        super(n);
        sourness = 1.0;
    }

    Cranberry(String name, boolean isRipe, double sourness) {
        super(name, isRipe);
        this.sourness = sourness;
    }
}
