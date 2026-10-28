public class UPIPayment extends PaymentMethod {

    UPIPayment(String accountName) {
        super(accountName);
    }

    @Override
    void pay(double amount) {

        if (amount > 0) {
            System.out.println(
                    "UPI payment requested: ₹" + amount
            );
        } else {
            System.out.println("Invalid amount.");
        }
    }
}