package ClassWork12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Book> library = new HashSet<>();

        Book a = new Book("Walter Scott","Ivanhoe", (short) 1900);
        Book b = new Book("Charles Dickens","Oliver Twist", (short) 1987);
        Book c = new Book("Arthur Conan Doyle","Sherlock Holmes", (short) 1930);
        Book d = new Book("Edgar Allan Poe","Golden bug", (short) 1879);
        Book e = new Book("Lev Tolstoy","War and Peace", (short) 1988);
        Book e1 = new Book("Lev Tolstoy","War and Peace", (short) 1900);
        Book f = new Book("Defoe", "Gulliver's Voyage", (short) 2012);

        List<Book> bunchOfBooks = Arrays.asList(e, e1, b, c, d, a);
        library.addAll(bunchOfBooks);

        System.out.println(library);

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        System.out.println(numbers);
    }
}
