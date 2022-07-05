package ClassWork9.multierarchy;

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;



    TwoDShape() {
        height = width = 0.0;
        name = "undefined";
    }

    TwoDShape(double x, String name) {
        height = width = x;
        this.name = name;
    }

    TwoDShape(double width, double height, String name) {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    String getName() {
        return name;
    }

    void setWidth(double width) {
        this.width = width;
    }
    void setHeight(double height) {
            this.height = height;
    }
    void showDim() {
        System.out.println("Width and height: " + width + " and " + height );
    }
    abstract double areaCalc();
}
