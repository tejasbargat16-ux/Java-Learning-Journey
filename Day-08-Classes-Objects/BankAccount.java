public class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {

        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {

        balance = balance + amount;

        System.out.println(
                "Deposited: ₹" + amount
        );
    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println(
                    "Withdrawn: ₹" + amount
            );

        } else {

            System.out.println(
                    "Insufficient balance."
            );
        }
    }

    void displayBalance() {

        System.out.println(
                "Account Holder: " + accountHolder
        );

        System.out.println(
                "Balance: ₹" + balance
        );
    }
}
