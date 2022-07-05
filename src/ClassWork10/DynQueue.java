package ClassWork10;

public class DynQueue implements Queueble{
    private char q[];
    private int putLoc, getLoc;

    DynQueue(int size) {
        q = new char[size+1];
        putLoc = getLoc = 0;
    }

    @Override
    public void put(char ch) {
        if (putLoc == q.length - 1) {
            char t[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
        }
        putLoc++;
        q[putLoc] = ch;
    }

    @Override
    public char get() {
        if (getLoc == putLoc) {
            System.out.println(" - The queue is empty");
            return (char) 0;
        }
        getLoc++;
        return q[getLoc];
    }
}

