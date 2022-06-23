package ClassWork8;

public class SDemo2 {
    public static void main(String[] args) {
        System.out.println("Value of val is: " + StaticMethod.val);
        System.out.println("Value returned by valDiv2: " + StaticMethod.valDiv2());

        StaticMethod.val = 4;
        System.out.println("Value of val is: " + StaticMethod.val);
        System.out.println("Value returned by valDiv2: " + StaticMethod.valDiv2());
    }
}
