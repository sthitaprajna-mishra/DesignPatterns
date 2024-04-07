package Singleton.example1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(100);

        for(int i = 0; i < 200; i++) {
            threadPool.execute(() -> NaiveSingleton.getInstance()); // ThreadSafeSingleton.getInstance()
        }

        threadPool.shutdown();
    }
}
