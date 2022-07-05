package ClassWork10;

public class FixedQueue implements Queueble{
    private char q[];
    private int putLoc, getLoc;

    FixedQueue(int size) {
        q = new char[size+1];
        putLoc = getLoc = 0;
    }

    public void put(char ch) {
        if (putLoc == q.length - 1) {
            System.out.println(" - The queue is full");
            return;
        }
        putLoc++;
        q[putLoc] = ch;
    }

    public char get() {
        if (getLoc == putLoc) {
            System.out.println(" - The queue is empty");
            return (char) 0;
        }
        getLoc++;
        return q[getLoc];
    }

}
