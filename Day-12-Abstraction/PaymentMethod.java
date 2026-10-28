public abstract class PaymentMethod {

    protected String accountName;

    PaymentMethod(String accountName) {
        this.accountName = accountName;
    }

    abstract void pay(double amount);

    void showAccount() {
        System.out.println("Account: " + accountName);
    }
}