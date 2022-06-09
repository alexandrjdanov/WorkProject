public class DecrFor {
    public static void main(String[] args) {
        int x = 0;
        int count;
        int i, j;

        for (count = 10; count < 5; count++) {
            System.out.println(x);
        }

        for (i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i & j: " + i + " " + j);
        }
    }
}
