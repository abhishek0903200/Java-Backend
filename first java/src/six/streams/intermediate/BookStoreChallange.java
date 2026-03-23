package six.streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BookStoreChallange {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java Basics", 2015, 299.99, "Programming"),
                new Book("Advanced Java", 2018, 499.50, "Programming"),
                new Book("Python Guide", 2020, 350.75, "Programming"),
                new Book("Data Structures", 2017, 450.00, "CS"),
                new Book("Algorithms", 2019, 550.25, "CS"),
                new Book("Clean Code", 2008, 650.00, "Software"),
                new Book("System Design", 2021, 799.99, "Software"),
                new Book("Spring Boot", 2022, 599.49, "Framework"),
                new Book("React Guide", 2021, 420.00, "Frontend"),
                new Book("Microservices", 2023, 899.99, "Architecture")
        );

        // price above 450
        books.stream()
                .filter(book -> book.price >450)
                .forEach(System.out::println);


        System.out.println("books having publication year kess than 2020");
        books.stream()
                .sorted(Comparator.comparing(book -> book.publicationYear))
                .filter(book -> book.publicationYear <2020)
                .forEach(System.out::println);

        books.stream()
                .sorted(Comparator.comparing(book -> book.price))
                .forEach(System.out::println);

        System.out.println("cooming soon to all title");
        books.stream()
                .map(book -> book.name + " (Coming Soon)")
                .forEach(System.out::println);

        System.out.println(" rare book with title more than 20 character ");
        books.stream()
                .filter(book -> book.name.length() > 11)
                .forEach(System.out::println);



    }
}
