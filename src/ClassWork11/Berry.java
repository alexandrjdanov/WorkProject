package ClassWork11;

abstract public class Berry {
    private int weight;
    private final String name;
    private String colour;
    private boolean isRipe;

    Berry(){
        name = "Undefined";
        isRipe = false;
        colour = "Undefined";
        weight = 0;
    }

    Berry(String name){
        this.name = name;
        isRipe = false;
        colour = "Undefined";
        weight = 0;
    }

    Berry(String name, boolean isRipe){
        this.name = name;
        this.isRipe = isRipe;
        colour = "Undefined";
        weight = 0;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isRipe() {
        return isRipe;
    }

    public void setRipe(boolean ripe) {
        isRipe = ripe;
    }

    @Override
    public String toString() {
        return "Berry{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", isRipe=" + isRipe +
                '}';
    }
}
