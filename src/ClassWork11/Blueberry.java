package ClassWork11;

public class Blueberry extends Berry{

    String levelOfVitamins;
    double sweetness;
    final static String n = "Blueberry";

    Blueberry() {
        super(n);
        sweetness = 1.0;
        levelOfVitamins = "low";
    }

    Blueberry(String name, boolean isRipe, String levelOfVitamins) {
        super(name, isRipe);
        this.levelOfVitamins = levelOfVitamins;
    }

    @Override
    public String toString() {

        return "\nBlueberry{" + super.toString() +
                "levelOfVitamins='" + levelOfVitamins + '\'' +
                ", sweetness=" + sweetness +
                '}' + "\n";
    }
}
