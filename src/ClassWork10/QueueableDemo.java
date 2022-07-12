package ClassWork10;

public class QueueableDemo {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        FixedQueue q1 = new FixedQueue(10);
        CircularQueue q2 = new CircularQueue(10);
        DynQueue q3 = new DynQueue(5);

        Queueble ref;

        char ch;
        int i;

        ref = q1;

        ref.multiplePut(10, 'A');
        ref.multipleGet(10, "Fixed");

        ref = q2;

        ref.multiplePut(10, 'A');
        ref.multipleGet(10, "Circular");
        // adding more values to circular queue
        ref.multiplePut(20, 'Z');
        ref.multipleGet(10, "Circular");

        System.out.println("Add symbols into circular queue contains and get them back:");
        for (i = 0; i < 20; i++) {
            ref.put((char) ('A' + i));
            ch = ref.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        ref = q3;

        ref.multiplePut(10, 'A');
        ref.multipleGet(10, "Dynamic");
    }
}
