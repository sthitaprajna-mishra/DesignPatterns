package Observer;

public interface Subject {
    void registerObserver(Observer oe);
    void removeObserver(Observer oe);
    void notifyObserver(Observer oe);
}
