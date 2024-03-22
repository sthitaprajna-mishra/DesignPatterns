package Flyweight;

public class BookType {
    public String category;
    public String publisher;
    public String location;

    BookType(String category, String publisher, String location) {
        this.category = category;
        this.publisher = publisher;
        this.location = location;
    }
}
