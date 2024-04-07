package Singleton.example1;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton uniqueInstance;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {
        if(uniqueInstance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new ThreadSafeSingleton();
                    System.out.println("New instance of uniqueInstance created by thread " + Thread.currentThread().getName());
                }
            }
        }
        return uniqueInstance;
    }
}
