package Observer.Store;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<IEventListener> listeners;

    public NotificationService() {
        this.listeners = new ArrayList<>();
    }

    public void subscribe(IEventListener listener) {
        this.listeners.add(listener);
    }

    public void unsubscribe(IEventListener listener) {
        this.listeners.remove(listener);
    }

    public void notifyService() {
        listeners.forEach(IEventListener::update);
    }
}
