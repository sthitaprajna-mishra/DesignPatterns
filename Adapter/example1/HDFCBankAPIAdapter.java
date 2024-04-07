package Adapter.example1;

public class HDFCBankAPIAdapter implements IBankAPIAdapter {
    private HDFCBankAPI hdfcBankAPI;

    public HDFCBankAPIAdapter() {
        this.hdfcBankAPI = new HDFCBankAPI();
    }

    @Override
    public double getFunds(String accountNumber) {
        return this.hdfcBankAPI.fetchBalance(accountNumber);
    }
}
