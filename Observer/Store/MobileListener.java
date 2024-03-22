package Observer.Store;

public class MobileListener implements IEventListener{
    private final String phoneNumber;

    public MobileListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        System.out.println("Sending message to phone number: " + phoneNumber);
    }
}
