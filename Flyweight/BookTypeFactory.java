package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class BookTypeFactory {
    static Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String category, String publisher, String location) {
        if(!bookTypes.containsKey(category)) {
            bookTypes.put(category, new BookType(category, publisher, location));
        }
        return bookTypes.get(category);
    }
}
