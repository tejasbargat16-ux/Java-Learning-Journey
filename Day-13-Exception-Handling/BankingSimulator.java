public class BankingSimulator {
    public static void main(String[] args) {

        try {
            BankAccount account =
                    new BankAccount("Tejas", 10000);

            System.out.println(
                    "Account Holder: " +
                    account.getAccountHolder()
            );

            System.out.println(
                    "Opening Balance: ₹" +
                    account.getBalance()
            );

            account.deposit(5000);

            System.out.println("Deposit successful.");

            account.withdraw(2000);

            System.out.println("Withdrawal successful.");

            // Test insufficient balance:
            // account.withdraw(50000);

            // Test invalid amount:
            // account.deposit(-500);

            System.out.println(
                    "Final Balance: ₹" +
                    account.getBalance()
            );

        } catch (InvalidAmountException e) {

            System.out.println(
                    "Transaction error: " + e.getMessage()
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Account error: " + e.getMessage()
            );
        }
    }
}
