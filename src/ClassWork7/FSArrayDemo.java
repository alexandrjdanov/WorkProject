package ClassWork7;

public class FSArrayDemo {
    public static void main(String[] args) {
        int x;
        FailSoftArray fs = new FailSoftArray(5, -1);
        System.out.println("Error processing with no report");

        for (int i = 0; i < (fs.longitude * 2); i++)
            fs.put(i, i*10);

        for (int i = 0; i < (fs.longitude * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.println(x + " ");
        }
        System.out.println();

        System.out.println("Error processing with reporting");

        for (int i = 0; i < (fs.longitude * 2); i++)
            if (!fs.put(i, i*10))
                System.out.println("The index " + i + " is out of range");

        for (int i = 0; i < (fs.longitude * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.println(x + " ");
            else System.out.println("The index " + i + " is out of range");
        }
    }
}
