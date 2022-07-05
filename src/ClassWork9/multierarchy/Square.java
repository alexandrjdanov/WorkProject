package ClassWork9.multierarchy;

public class Square extends TwoDShape{

    Square(double width){
        super(width, "Square");
    }

    @Override
    double areaCalc() {
        return getWidth()*getHeight();
    }
}
