package ClassWork10;

public class QueueFullException extends Exception{
    int size;

    QueueFullException(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nThe queue is full. Maximum queue size is " + size;
    }
}
