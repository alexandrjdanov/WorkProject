package ClassWork10;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        char ch;
        int i;

//        Queue test = new Queue(10);
////        test.q[0] = 99;
////        test.putLoc = -100;
//
//        System.out.println("Using bigQ to keep the alphabet");
//        for (i = 0; i < 26; i++)
//            bigQ.put((char) ('A' + i));
//
//        System.out.println("What contains bigQ:");
//        for (i = 0; i < 26; i++) {
//            ch = bigQ.get();
//            if (ch != (char) 0) System.out.print(ch);
//        }
//        System.out.println("\n");
//
//
//        System.out.println("Using smallQ to get an error");
//        for (i = 0; i < 5; i++) {
//            System.out.println("Trying to save " + (char) ('Z' - i));
//            smallQ.put((char) ('Z' - i));
//            System.out.println();
//        }
//        System.out.println();
//
//        System.out.println("What contains smallQ:");
//        for (i = 0; i < 5; i++) {
//            ch = smallQ.get();
//            if (ch != (char) 0) System.out.println(ch);
//        }

        Queue q1 = new Queue(10);
        char name[] = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);

        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        Queue q3 = new Queue(q1);

        System.out.println("q1 contains:");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.println(ch);
        }
            System.out.println("\n");

        System.out.println("q2 contains:");
        for (i = 0; i < 10; i++) {
            ch = q2.get();
            System.out.println(ch);
        }
        System.out.println("\n");

        System.out.println("q3 contains:");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.println(ch);
        }
    }
}
