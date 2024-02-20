package Observer.derek;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject{
    List<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    StockGrabber() {
        this.observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregisterObserver(Observer deleteObserver) {
        observers.remove(deleteObserver);
        System.out.println("Observer deleted");
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice) {
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice) {
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }
}
