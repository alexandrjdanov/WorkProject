package ClassWork4;

public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for (i = 1; i <= 5; sum+=i++) {
            System.out.println("Сумма = " + sum);
        }
        System.out.println("Сумма = " + sum);
    }
}