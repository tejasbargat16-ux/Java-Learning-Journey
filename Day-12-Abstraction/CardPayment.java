public class CardPayment extends PaymentMethod {

    CardPayment(String accountName) {
        super(accountName);
    }

    @Override
    void pay(double amount) {

        if (amount > 0) {
            System.out.println(
                    "Card payment requested: ₹" + amount
            );
        } else {
            System.out.println("Invalid amount.");
        }
    }
}