package ClassWork10;

public class ExceptionDemo1 {
    public static void main(String[] args) {


    int num[] = {4, 8, 16, 32, 64, 128};
    int den[] = {2, 0, 4, 4, 0, 8};

    for (int i = 0; i < num.length; i++) {
        try {
            System.out.println(num[i] + " / " + den[i] + " = " + num[i]/den[i]);
        } catch (ArithmeticException e) {
            System.out.println("Try to divide to zero!");
        }
    }
    }
}
