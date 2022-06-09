package ClassWork4;

import java.io.IOException;

public class BreakDemo3 {
    public static void main(String[] args) throws IOException {
        char ch;

        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop counter: " + i);
            System.out.print("Inner loop counter: ");
            int t = 0;
            while (t < 100) {
                if (t == 20) break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println("\n");
        }
        System.out.println("Loops are completed");
    }
}
