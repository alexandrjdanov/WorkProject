package ClassWork6;

public class TwoD {
    public static void main(String[] args) {
        int i, t;
        int table[][] = new int[3][4];
        for (t=0; t<3; ++t) {
            for (i=0; i<4; ++i) {
                table[t][i] = (t*4) + i+1;
                System.out.print(table[t][i] + "\t");
            }
            System.out.println();
        }
    }

    int k = 0;
    ArrayUtils helper = new ArrayUtils(k);
    helper.s


}
