package Flyweight;

public class Book {
    public String name;
    public double price;
    public BookType bookType;

    Book(String name, double price, BookType bookType) {
        this.name = name;
        this.price = price;
        this.bookType = bookType;
    }
}
