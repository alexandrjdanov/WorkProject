import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x = 343; //speed
        double y, z; // y - time, z - distance

        System.out.println("Sound speed is equal with " + x + " meters per second");
        Scanner input = new Scanner(System.in);
        System.out.println("In how much seconds the sound of echo returns after the clap: ");
        y = input.nextDouble();
        z = x * y / 2;
        System.out.println("Distance to the rock is equal with " + z + " meters");
    }
}
