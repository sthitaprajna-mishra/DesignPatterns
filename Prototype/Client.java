package Prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Novelty");
        bs.loadData();
        System.out.println(bs);

        BookShop bs1 = (BookShop) bs.clone();
        bs1.setShopName("A1");
//        bs1.loadData();
        System.out.println(bs1);
    }
}
