package ClassWork9.multierarchy;

public class Triangle extends TwoDShape {

    private String style;

    Triangle() {
        super();
        this.style = "none";
    }

    Triangle(double x) {
        super(x, "Triangle");
        this.style = "coloured";
    }

    Triangle(String style, double width, double height) {
        super(width, height, "Triangle");
        this.style = style;
    }

    double areaCalc() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle has style: " + style);
    }
}
