package ClassWork4;

public class BreakDemo {
    public static void main(String[] args) {
        int num;
        num = 100;
        for (int i = 0; i < num; i++) {
            System.out.println(i + " ");
            if (i*i >= num) break;
        }
        System.out.println("Цикл завершен");
    }
}
