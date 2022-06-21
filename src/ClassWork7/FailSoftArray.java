package ClassWork7;

public class FailSoftArray {
    private int a[];
    private int errval;
    public int longitude;

    public FailSoftArray(int size, int errV) {
        a = new int[size];
        errval = errV;
        longitude = size;
    }

    public int get(int index) {
        if (index >= 0 & index < longitude) return a[index];
        return errval;
    }

    public boolean put(int index, int val) {
        if (indexOk(index)) {
            a[index] = val;
            return true;
        }
       return false;
    }

    public boolean indexOk(int index) {
        if (index >= 0 & index < longitude) return true;
        return false;
    }

}
