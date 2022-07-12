package ClassWork10;

public class CircularQueue implements Queueble{

    private char q[];
    private int putLoc, getLoc;

    CircularQueue(int size) {
        q = new char[size+1];
        putLoc = getLoc = 0;
    }


    public void put(char ch) throws QueueFullException{
        if (putLoc + 1 == getLoc | ((putLoc == q.length - 1) & (getLoc == 0))) {
        throw new QueueFullException(q.length);
    }
    putLoc++;
        if (putLoc == q.length) putLoc = 0;
        q[putLoc] = ch;
    }


    public char get() throws QueueEmptyException{
        if (getLoc == putLoc) {
            throw new QueueEmptyException();
        }
        getLoc++;
        if (getLoc == q.length) getLoc = 0;
        return q[getLoc];
    }
}

