package ClassWork8.Shapes;

public class ShapesApp {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("Colored", 4.0, 4.0);
        Triangle t2 = new Triangle("Contoured", 5.0, 10.0);
        TwoDShape t3 = new TwoDShape(3, 4);

        t1.setWidth(4.0);
        t1.setHeight(4.0);

        t2.setWidth(5.0);
        t2.setHeight(10.0);

        System.out.println("t1 info:");
        t1.showStyle();
        t1.showDim();
        System.out.println("t1 Area is equal to: " + t1.areaCalc());

        System.out.println("\nt2 info:");
        t2.showStyle();
        t2.showDim();
        System.out.println("t2 Area is equal to: " + t2.areaCalc());
    }
}
