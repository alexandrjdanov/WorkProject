package ClassWork6;

import java.util.Collections;

public class MinMax {
    public static void main(String[] args) {
        int num[] = new int[10];

        int min, max;

        num[0] = 99;
        num[1] = 23;
        num[2] = -11;
        num[3] = 3520;
        num[4] = 54;
        num[5] = 912;
        num[6] = 222;
        num[7] = 22;
        num[8] = 59;
        num[9] = 94;

        int num2[] = {1, 2, -56, 0, 8, 4, 2, 32, 25, 55};


        min = max = num2[0];
        for (int i=1; i<10; i++) {
            if (num2[i] < min) min = num2[i];
            if (num2[i] > max) max = num2[i];
        }

        System.out.println("min & max are " + min + " " + max);
    }
}
