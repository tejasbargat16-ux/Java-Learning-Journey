public class BankAccount {
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        if (accountHolder == null || accountHolder.isBlank()) {
            throw new IllegalArgumentException(
                    "Account holder name is required."
            );
        }

        if (!Double.isFinite(balance) || balance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance must be valid and non-negative."
            );
        }

        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount)
            throws InvalidAmountException {

        validateAmount(amount);
        balance += amount;
    }

    public void withdraw(double amount)
            throws InvalidAmountException {

        validateAmount(amount);

        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient balance."
            );
        }

        balance -= amount;
    }

    private void validateAmount(double amount)
            throws InvalidAmountException {

        if (!Double.isFinite(amount) || amount <= 0) {
            throw new InvalidAmountException(
                    "Transaction amount must be positive and finite."
            );
        }
    }
}
