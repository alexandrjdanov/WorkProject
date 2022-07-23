package ClassWork12;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, Book> library = new HashMap<>();

        Book a = new Book("Walter Scott", "Ivanhoe", (short) 1900);
        Book b = new Book("Charles Dickens", "Oliver Twist", (short) 1987);
        Book c = new Book("Arthur Conan Doyle", "Sherlock Holmes", (short) 1930);
        Book d = new Book("Edgar Allan Poe", "Golden bug", (short) 1879);
        Book e = new Book("Lev Tolstoy", "War and Peace", (short) 1988);
        Book e1 = new Book("Lev Tolstoy", "War and Peace", (short) 1900);
        Book f = new Book("Defoe", "Gulliver's Voyage", (short) 2012);

        List<Book> bunchOfBooks = Arrays.asList(e, e1, b, c, d, a);

        for (int i = 0; i < bunchOfBooks.size(); i++) {
            if (library.put(i, bunchOfBooks.get(i)) != null) {
                throw new IllegalStateException("Duplicate key");
            }
        }
        System.out.println(library);

        for (Integer i : library.keySet()) {
            System.out.println(i);
        }

        for (Book i : library.values()) {
            System.out.println(i);
        }

    }
//    public static Map<Integer, Book> convertListToMap(List<Book> bunchOfBooks) {
//        Map<Integer, Book> map = new HashMap<>();
//        for (int i = 0; i < bunchOfBooks.size(); i++) {
//            if (map.put(i, bunchOfBooks.get(i)) != null) {
//                throw  new IllegalStateException("Duplicate key");
//            }
//        }
//        return map;
//    }
}
