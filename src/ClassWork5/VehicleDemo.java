package ClassWork5;

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle mercedes = new Vehicle(5,
                                        20,
                                        21);
        Vehicle jeep = new Vehicle(7,
                                    25,
                                    15);


        System.out.println("Mercedes can take " + mercedes.passengers + " passengers.");
        mercedes.range();
        System.out.println();
        System.out.println("Jeep can take " + jeep.passengers + " passengers.");
        jeep.range();

        int howManyMilesJeepCanGo = jeep.rangeInt();
        System.out.println("From method rangeInt " + howManyMilesJeepCanGo);
        System.out.println();

        double gallons = jeep.fuelNeeded(750);
        int rangeNeeded = 1400;
        double gallons2 = mercedes.fuelNeeded(rangeNeeded);
        System.out.println("Jeep needs " + gallons + " gallons to go for the distance of 700 miles.");
        System.out.println("Mercedes needs " + gallons2 + " gallons to go for the distance of " + rangeNeeded);
    }
}
