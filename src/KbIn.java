import java.io.IOException;
import java.util.Scanner;

public class KbIn {
    public static void main(String[] args) throws IOException {


        char ch;
//        char ch1;
//        Scanner input = new Scanner(System.in);
//        ch1 = input.next().charAt(0);


        System.out.println("Push the necessary button, and after push [ENTER]: ");

        ch = (char) System.in.read();

        System.out.println("You pushed button: " + ch);
    }
}
