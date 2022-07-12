package ClassWork10;

public class DynQueue implements Queueble{
    private char q[];
    private int putLoc, getLoc;

    DynQueue(int size) {
        q = new char[size+1];
        putLoc = getLoc = 0;
    }


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


    public char get() throws QueueEmptyException{
        if (getLoc == putLoc) {
            throw new QueueEmptyException();
        }
        getLoc++;
        return q[getLoc];
    }

}

