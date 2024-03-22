package Observer.Store;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();
        store.getNotificationService().subscribe(new EmailListener("rajeevsohani@gmail.com"));
        store.getNotificationService().subscribe(new EmailListener("abbasali@gmail.com"));
        store.getNotificationService().subscribe(new MobileListener("+91 9435672345"));
        store.getNotificationService().subscribe(new MobileListener("+91 9087372366"));
        store.getNotificationService().subscribe(new MobileListener("+91 8770197658"));

        MobileListener tempCustomer = new MobileListener("+91 8548729271");
        store.getNotificationService().subscribe(tempCustomer);


        store.promoteNewItem();

        store.getNotificationService().unsubscribe(tempCustomer);

        System.out.println("--------------- TEMP CUSTOMER REMOVED -------------------");

        store.promoteNewItem();

    }
}
