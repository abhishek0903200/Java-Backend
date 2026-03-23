package six.streams.intermediate;

import jdk.jfr.Category;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateDemo {
    @Override
    public String toString() {
        return "IntermediateDemo{}";
    }

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



        // 1 filtering books price less than 450
        books.stream()
             .filter( b -> b.price < 450)
             .forEach(System.out::println);

        Stream<Book> stream1 = books.stream();
        Stream<Book> stream2 = stream1.filter(b -> b.price < 450);
        stream2.forEach(System.out::println);

        // mapping book name to upper case
        books.stream()
                .map(book -> book.name.toUpperCase())
                .forEach(System.out::println);

        // sorting book by publication date
        books.stream()
                .sorted(Comparator.comparing(book -> book.publicationYear))
                .forEach(System.out::println);

        // distinct remove all duplicate titles
        books.stream()
                .distinct()
                .forEach(System.out::println);

        // limit display only first 3 book
        books.stream()
                .sorted(Comparator.comparing(book -> book.publicationYear))
                .limit(3)
                .forEach(System.out::println);

        // skip the first 2 books
        System.out.println("Skipped books");
        books.stream()
                .skip(2)
                .forEach(System.out::println);


        // total cost of all bookstore
        Double bookCost = books.stream()
                .mapToDouble(book -> book.price)
                .reduce(0,Double::sum);
        System.out.println(bookCost);

        // collect names of all bokk
        List<String> bookTitle = books.stream()
                .map(book -> book.name)
                .collect(Collectors.toList());
        System.out.println(bookTitle);

        //grouping books by category
        Map<String, List<Book>> byCategory = books.stream()
                .collect(Collectors.groupingBy(Book::getCategory));

        byCategory.forEach((category, bookList) -> {
            bookList.forEach(System.out::println);
        });
    }
}
