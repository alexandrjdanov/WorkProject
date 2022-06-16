package ClassWork6;

public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            sample[i] = i+30;
            System.out.println("Element [" + i + "]: " + sample[i]);
        }

//        for (i = 0; i < 10; i++) {
//            System.out.println("Element [" + i + "]: " + sample[i]);
//        }
    }
}
