public class PaymentDemo {

    public static void main(String[] args) {

        Payment payment;

        payment = new UPIPayment();
        payment.pay(500);

        payment = new CardPayment();
        payment.pay(1200);
    }
}
