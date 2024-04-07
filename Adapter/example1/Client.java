package Adapter.example1;

public class Client {
    public static void main(String[] args) {
        String accNumber = "154162488";

        PhonePe phonePeApp = new PhonePe(new YesBankAPIAdapter());
        phonePeApp.displayTotalFunds(accNumber);
    }
}
