package ClassWork3;

import java.io.IOException;
import java.util.Scanner;
public class ForTest {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'M';
        System.out.println("задумана буква из диапазона A-Z.");
        System.out.println("Попытайтесь её угадать.");
        System.out.println("Для остановки нажмите [S]");
        Scanner input = new Scanner(System.in);
        ch = input.next().charAt(0);
        for(int x = 0; ch!='S'; x++) {
            System.out.println("Попытка № " + (x + 1));
            if (ch == answer) {
                System.out.println("Правильно!");
                break;
            }
            else {
                System.out.print("Извините, нужная буква находится ближе к ");
                if (ch < answer)
                    System.out.println(" концу алфавита. Попробуйте ещё раз");
                else System.out.println(" началу алфавита. Попробуйте ещё раз");
                ch = input.next().charAt(0);
            }
        }
    }
}