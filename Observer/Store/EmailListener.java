package Observer.Store;

public class EmailListener implements IEventListener{
    private final String emailAddress;

    public EmailListener(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update() {
        System.out.println("Sending mail to email id: " + emailAddress);
    }
}
