public class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {

        this.accountHolder = accountHolder;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            System.out.println(
                    "Deposited: ₹" + amount
            );

        } else {

            System.out.println(
                    "Invalid deposit amount."
            );
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println(
                    "Invalid withdrawal amount."
            );

        } else if (amount > balance) {

            System.out.println(
                    "Insufficient balance."
            );

        } else {

            balance -= amount;

            System.out.println(
                    "Withdrawn: ₹" + amount
            );
        }
    }

    public void displayAccount() {

        System.out.println("\n===== BANK ACCOUNT =====");
        System.out.println(
                "Account Holder: " + accountHolder
        );
        System.out.println(
                "Balance: ₹" + balance
        );
    }
}
