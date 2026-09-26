public class BankDemo {
    public static void main(String[] args) {
        BankAccount account =
                new BankAccount("Tejas", 10000);
        account.displayAccount();
        System.out.println();

        account.deposit(5000);

        account.withdraw(2000);

        account.withdraw(20000);

        account.displayAccount();
    }
}
