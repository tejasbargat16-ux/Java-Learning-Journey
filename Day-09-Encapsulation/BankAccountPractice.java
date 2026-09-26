public class BankAccountPractice {

    private double balance;

    // Constructor
    public BankAccountPractice(double balance) {

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Deposit
    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            System.out.println(
                    "Deposited: ₹" + amount
            );

        } else {

            System.out.println(
                    "Deposit amount must be positive."
            );
        }
    }

    // Withdrawal
    public void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println(
                    "Withdrawal amount must be positive."
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

    // Getter
    public double getBalance() {
        return balance;
    }

    // Main method
    public static void main(String[] args) {

        BankAccountPractice account =
                new BankAccountPractice(10000);

        System.out.println(
                "Initial Balance: ₹" +
                account.getBalance()
        );

        account.deposit(5000);

        account.withdraw(2000);

        account.withdraw(20000);

        System.out.println(
                "Final Balance: ₹" +
                account.getBalance()
        );
    }
}
