package Flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        final int BOOKS_TO_INSERT = 10_000_000;
        final int BOOK_TYPES = 2;

        Store myStore = new Store();

        for(int i = 0; i < BOOKS_TO_INSERT/BOOK_TYPES; i++) {
            myStore.storeBooks(getRandomName(), getRandomPrice(), "Fiction", "Dream-house Publishers Ltd.", "Bengaluru");
            myStore.storeBooks(getRandomName(), getRandomPrice(), "Biography", "MacMohan & Brothers Ltd.", "Pune");
        }

        System.out.println(BOOKS_TO_INSERT + " Books Inserted");
        System.out.println("==========================================");
        System.out.println("Memory Usage: ");
        System.out.println("Book Size (20 bytes) * " + BOOKS_TO_INSERT + " + BookTypes Size (30 bytes) * " + BOOK_TYPES + "");
        System.out.println("==========================================");
        System.out.println("Total: " + ((BOOKS_TO_INSERT * 20 + BOOK_TYPES * 30) / 1024 / 1024) + "MB (instead of " + ((BOOKS_TO_INSERT * 50) / 1024 / 1024) + "MB)");


    }

    public static String getRandomName() {
        List<String> bookNames = List.of("book1", "book2", "book3", "book4", "book5");
        return bookNames.get(new Random().nextInt(bookNames.size()));
    }

    public static double getRandomPrice() {
        return new Random().nextDouble(100);
    }
}
