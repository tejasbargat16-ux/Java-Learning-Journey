public class BankDemo {
    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Tejas", 10000);

        account.displayBalance();

        System.out.println();

        account.deposit(5000);

        account.withdraw(2000);

        System.out.println();

        account.displayBalance();
    }
}
