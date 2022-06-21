package ClassWork7;

public class RecursionDemo {
    public static void main(String[] args) {
        RecursiveFactorial f = new RecursiveFactorial();

        System.out.println("Let's use recursion to calculate factorial");
        System.out.println("Factorial 3 is equal to " + f.calculateFactorial(3));
        System.out.println("Factorial 4 is equal to " + f.calculateFactorial(4));
        System.out.println("Factorial 5 is equal to " + f.calculateFactorial(5));
    }
}
