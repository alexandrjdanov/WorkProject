package ClassWork8.Shapes;

public class TwoDShape {
    private double width;
    private double height;

    TwoDShape(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
        else System.out.println("This value is not good for width. Width wasn't set");
    }
    void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
        else System.out.println("This value is not good for height. Height wasn't set");
    }
    void showDim() {
        System.out.println("Width and height: " + width + " and " + height );
    }
}
