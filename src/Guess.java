import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'S';
        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.println("Попытайтесь её угадать: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("Правильно!");
        else System.out.println("Вы не угадали");
    }
}
