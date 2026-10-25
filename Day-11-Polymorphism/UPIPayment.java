public class UPIPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println(
                "Paid ₹" + amount + " using UPI."
        );
    }
}
