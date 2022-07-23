package ClassWork5;

public class Truck extends Vehicle{
    private int cargocap;

    Truck(int numberOfPassengers, int fuelCapVolume, int milesPerGallon, int cargocap) {
        super(numberOfPassengers, fuelCapVolume, milesPerGallon);
        this.cargocap = cargocap;
    }

    int getCargocap() {
        return cargocap;
    }

    void putCargo(int cargocap) {
        this.cargocap = cargocap;
    }
}
