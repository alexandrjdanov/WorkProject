package ClassWork10;

public class QueueableDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        CircularQueue q2 = new CircularQueue(10);
        DynQueue q3 = new DynQueue(5);

        Queueble ref;

        char ch;
        int i;

        ref = q1;
        for (i = 0; i < 10; i++) {
            ref.put((char) ('A' + i));
        }

        System.out.println("Fixed queue contains:");
        for (i = 0; i < 10; i++) {
            ch = ref.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        ref = q2;
        // adding values to circular queue
        for (i = 0; i < 10; i++) {
            ref.put((char) ('A' + i));
        }

        System.out.println("Circular queue contains:");
        for (i = 0; i < 10; i++) {
            ch = ref.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        // adding more values to circular queue
        for (i = 0; i < 20; i++) {
            ref.put((char) ('Z' - i));
        }

        System.out.println("Circular queue contains:");
        for (i = 0; i < 10; i++) {
            ch = ref.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Add symbols into circular queue contains and get them back:");
        for (i = 0; i < 20; i++) {
            ref.put((char) ('A' + i));
            ch = ref.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        ref = q3;
        for (i = 0; i < 10; i++) {
            ref.put((char) ('A' + i));
        }

        System.out.println("Dynamic queue contains:");
        for (i = 0; i < 10; i++) {
            ch = ref.get();
            System.out.print(ch);
        }
        System.out.println("\n");
    }
}
