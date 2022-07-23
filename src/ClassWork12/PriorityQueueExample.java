package ClassWork12;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Book> library = new PriorityQueue();

        Book a = new Book("Walter Scott","Ivanhoe", (short) 1900);
        Book b = new Book("Charles Dickens","Oliver Twist", (short) 1987);
        Book c = new Book("Arthur Conan Doyle","Sherlock Holmes", (short) 1930);
        Book d = new Book("Edgar Allan Poe","Golden bug", (short) 1879);
        Book e = new Book("Lev Tolstoy","War and Peace", (short) 1988);
        Book e1 = new Book("Lev Tolstoy","War and Peace", (short) 1900);
        Book f = new Book("Defoe", "Gulliver's Voyage", (short) 2012);

        List<Book> bunchOfBooks = Arrays.asList(e, b, c, d, a);
        library.add(a);
        library.add(b);
        library.add(c);
        library.add(d);
        library.add(e);
        library.add(f);
        System.out.println("This is peek:");
        System.out.println(library.peek());
        System.out.println("This is poll:");
        System.out.println(library.poll());

        System.out.println(library);

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(3);
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        Integer a1 = 2;
        Integer a2 = 4;
        System.out.println("Compare to:");
        System.out.println(a1.compareTo(a2));
    }
}
