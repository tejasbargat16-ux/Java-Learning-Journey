public class PaymentSystemDemo {

    public static void main(String[] args) {

        PaymentMethod payment;

        payment = new UPIPayment("Tejas");
        payment.showAccount();
        payment.pay(500);

        System.out.println();

        payment = new CardPayment("Tejas");
        payment.showAccount();
        payment.pay(1200);
    }
}