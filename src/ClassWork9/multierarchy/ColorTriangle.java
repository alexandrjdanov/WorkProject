package ClassWork9.multierarchy;

public class ColorTriangle extends Triangle {

    private String color;

    ColorTriangle(String color, String style, double width, double height) {
        super(style, width, height);
        this.color = color;
    }

    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Triangle has color: " + color);
    }
}
