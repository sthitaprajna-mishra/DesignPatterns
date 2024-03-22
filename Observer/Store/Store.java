package Observer.Store;

public class Store {
    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void promoteNewItem() {
        this.notificationService.notifyService();
    }

    public NotificationService getNotificationService() {
        return this.notificationService;
    }
}
