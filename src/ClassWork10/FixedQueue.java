package ClassWork10;

public class FixedQueue implements Queueble{
    private char q[];
    private int putLoc, getLoc;

    FixedQueue(int size) {
        q = new char[size+1];
        putLoc = getLoc = 0;
    }

    public void put(char ch) throws QueueFullException{
        if (putLoc == q.length - 1) {
            throw new QueueFullException(q.length);
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
