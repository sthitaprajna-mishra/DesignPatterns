package Singleton.example1;

public class NaiveSingleton {
    private static NaiveSingleton uniqueInstance;

    private NaiveSingleton() {}

    public static NaiveSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new NaiveSingleton();
            System.out.println("New instance of uniqueInstance created by thread " + Thread.currentThread().getName());
        }
        return uniqueInstance;
    }
}
