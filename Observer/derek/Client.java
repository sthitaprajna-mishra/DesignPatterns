package Observer.derek;

public class Client {
    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(667.60);
        stockGrabber.setGOOGPrice(578.25);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(203.00);
        stockGrabber.setAAPLPrice(654.55);
        stockGrabber.setGOOGPrice(599.60);

    }
}
