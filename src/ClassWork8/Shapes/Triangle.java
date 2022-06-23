package ClassWork8.Shapes;

public class Triangle extends TwoDShape{

    String style;

    Triangle(String style, double width, double height) {
        super(width, height);
        this.style = style;
    }

    double areaCalc() {
        return getWidth() * getHeight();
    }

    void showStyle() {
        System.out.println("Triangle has style: " + style);
    }
}
