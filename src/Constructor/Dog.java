package Constructor;

public class Dog {

    String name;
    String colour;
    String breed;
    int weight;

    Dog(){

    }

    Dog(String name, String colour, String breed, int weight) {
        this.name = name;
        this.colour = colour;
        this.breed = breed;
        this.weight = weight;
    }

    Dog(String name, String colour, int weight) {
        this.name = name;
        this.colour = colour;
        this.breed = "unknown";
        this.weight = weight;
    }

    void bark() {
        System.out.println("How aw aw");
    }
}
