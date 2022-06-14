package ClassWork4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        int a, b, c, d, e;

        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        e = in.nextInt();
        int[] mas = new int[] {a, b, c, d, e};

        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
    }
}
