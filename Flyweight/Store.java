package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Book> books = new ArrayList<>();

    public void storeBooks(String name, double price, String category, String publisher, String location) {
        BookType bookType = BookTypeFactory.getBookType(category, publisher, location);
        books.add(new Book(name, price, bookType));
    }

    public void display() {
        books.forEach(System.out::println);
    }
}
