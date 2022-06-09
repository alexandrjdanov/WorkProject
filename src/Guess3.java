import java.io.IOException;

public class Guess3 {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'S';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.println("Попытайтесь её угадать: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("Правильно!");
        else {
            System.out.print("Извините, нужная буква находится ближе к");
            if (ch < answer) System.out.println(" концу алфавита");
            else System.out.println(" началу алфавита");
        }
    }
}
