package ClassWork7;

public class Block {
    int a, b, c;
    int volume;

    public Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c;
    }

    boolean sameBlock(Block ob) {
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    boolean sameVolume(Block ob) {
        if (ob.volume == volume) return true;
        else return false;
    }
}
