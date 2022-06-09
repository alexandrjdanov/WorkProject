package ClassWork4;

import java.io.IOException;

public class Guess4 {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'S';

        do {
            System.out.println("Задумана буква A-Z");
            System.out.println("Угадайте её:");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("Правильно!");
            else {
                System.out.print("Нужная буква находится ");
                if (ch < answer) System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Попробуйте ещё раз");
            }
        } while (answer != ch);
    }
}
