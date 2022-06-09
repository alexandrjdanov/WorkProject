package ClassWork3;

public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;

        b = (byte) (b * b);

        char ch1 = 'a', ch2 = 'b';
        ch1 = (char) (ch1 + ch2);
    }

    public static class ScopeDemo {
        public static void main(String[] args) {
            int x;

            x = 10;
            if (x == 10) {
                int y = 20;
                System.out.println("x and y: " + x + " " + y);
                x = y * 2;
            }
            System.out.println("x is " + x);
        }
    }

    public static class SqrRoot {
        public static void main(String[] args) {
            double num, sroot, rerr;

            for (num = 1.0; num < 100.0; num++) {
                sroot = Math.sqrt(num);
                System.out.println("Квадратный корень из " + num + " равен: " + sroot);

                rerr = num - (sroot * sroot);
                System.out.println("Ошибка округления: " + rerr + "\n");
            }
        }
    }
}
