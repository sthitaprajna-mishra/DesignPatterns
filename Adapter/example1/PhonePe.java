package Adapter.example1;

public class PhonePe {
    private IBankAPIAdapter APIAdapter;

    public PhonePe(IBankAPIAdapter APIAdapter) {
        this.APIAdapter = APIAdapter;
    }

    public void displayTotalFunds(String accountNumber) {
        double funds = this.APIAdapter.getFunds(accountNumber);
        System.out.println("Account Number: " + accountNumber + "\nBalance: " + funds);
    }
}
