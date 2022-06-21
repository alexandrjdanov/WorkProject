package ClassWork7;

public class RecursionDemo2 {
    public static void main(String[] args) {
        IterativeFactorial f = new IterativeFactorial();

        System.out.println("Let's use iteration to calculate factorial");
        System.out.println("Factorial 3 is equal to " + f.calculateFactorial(3));
        System.out.println("Factorial 4 is equal to " + f.calculateFactorial(4));
        System.out.println("Factorial 5 is equal to " + f.calculateFactorial(5));
    }
}
