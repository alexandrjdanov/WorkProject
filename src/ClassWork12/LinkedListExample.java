package ClassWork12;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println("Size is " + numbers.size());
//
//        numbers.add(7, 8);
//        System.out.println("New size is + " + numbers.size());

        LinkedList<Book> library = new LinkedList<>();

        Book a = new Book("Walter Scott","Ivanhoe", (short) 1900);
        Book b = new Book("Charles Dickens","Oliver Twist", (short) 1987);
        Book c = new Book("Arthur Conan Doyle","Sherlock Holmes", (short) 1930);
        Book d = new Book("Edgar Allan Poe","Golden bug", (short) 1879);
        Book e = new Book("Lev Tolstoy","War and Peace", (short) 1900);
        Book e1 = new Book("Lev Tolstoy","War and Peace", (short) 1900);
        Book f = new Book("Defoe", "Gulliver's Voyage");

        List<Book> bunchOfBooks = Arrays.asList(e, b, c, d, a, e);
        library.addAll(bunchOfBooks);
        library.add(e);
        System.out.println(library);
        library.removeFirstOccurrence(e);
        System.out.println("--------------------------------------------------------------");
        System.out.println(library);

        System.out.println(library.subList(2, 4));

        Book[] libArr = new Book[library.size()];
        library.toArray(libArr);
        System.out.println("This is libArr");
        System.out.println(Arrays.toString(libArr));

        Comparator <Book> nameComparator = Comparator.comparing(Book::getName);
        library.sort(nameComparator);

        Comparator <Book> ageComparator = Comparator.comparing(Book::getAge);
        library.sort(ageComparator);
        Collections.sort(library, Comparator.comparing(Book::getAge).reversed());

        System.out.println("After sorting:");
        System.out.println(library);
    }
}
