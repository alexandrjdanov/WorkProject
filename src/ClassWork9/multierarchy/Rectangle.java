package ClassWork9.multierarchy;

public class Rectangle extends TwoDShape{

    public Rectangle(double width, double height) {
        super(width, height, "Rectangle");
    }

    @Override
    double areaCalc() {
        return getWidth()*getHeight();
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }
}
