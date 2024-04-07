package Adapter.example1;

public class YesBankAPIAdapter implements IBankAPIAdapter{
    private YesBankAPI yesBankAPI;

    public YesBankAPIAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public double getFunds(String accountNumber) {
        return this.yesBankAPI.getBalanceAmount(accountNumber);
    }
}
