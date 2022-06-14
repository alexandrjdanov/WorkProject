package ClassWork5;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int numberOfPassengers, int fuelCapVolume, int milesPerGallon) {
        passengers = numberOfPassengers;
        fuelcap = fuelCapVolume;
        mpg = milesPerGallon;
    }

    void range() {
        System.out.println("Maximum distance with full fuelcap is " + fuelcap * mpg + " miles");
    }

    void myMethod() {
        int i;
        for (i=0; i<10; i++) {
            if (i==5) return;
            System.out.println();
        }
    }

    int rangeInt() {
        int result;
        result = mpg * fuelcap;
        return result;
    }

    double fuelNeeded(int distance) {
        return (double) distance / mpg;
    }


}
