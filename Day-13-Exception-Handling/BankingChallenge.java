public class BankingChallenge {

    private double balance;

    public BankingChallenge(double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative.");
        }

        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit must be positive.");
        }

        balance += amount;
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal must be positive.");
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient balance.");
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        try {

            BankingChallenge account = new BankingChallenge(10000);

            account.deposit(2000);
            account.withdraw(3000);

            System.out.println(
                    "Final balance: ₹" +
                            account.getBalance());

            account.withdraw(50000);

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Transaction failed: " +
                            e.getMessage());

        } finally {

            System.out.println(
                    "Transaction session completed.");
        }
    }
}