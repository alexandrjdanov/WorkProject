package ClassWork10;

public class Queue {
    private char q[];
    private int putLoc, getLoc;

    Queue(int size) {
        q = new char[size+1];
        putLoc = getLoc = 0;
    }

    Queue(Queue ob) {
        putLoc = ob.putLoc;
        getLoc = ob.getLoc;
        q = new char[ob.q.length];

        for (int i = getLoc + 1; i <= putLoc; i++){
            q[i] = ob.q[i];
        }
    }

    Queue(char a[]) {
        putLoc = 0;
        getLoc = 0;
        q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++)
            put(a[i]);
    }

    void put(char ch) {
        if (putLoc == q.length - 1) {
            System.out.println(" - The queue is full");
            return;
        }
        putLoc++;
        q[putLoc] = ch;
    }

    char get() {
        if (getLoc == putLoc) {
            System.out.println(" - The queue is empty");
            return (char) 0;
        }
        getLoc++;
        return q[getLoc];
    }
}
