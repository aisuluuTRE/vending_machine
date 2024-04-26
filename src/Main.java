import payment.CoinPaymentReceiver;


public class Main {
    public static void main(String[] args) {

        PaymentReceiver paymentReceiver = new CoinPaymentReceiver();
        AppRunner.run(paymentReceiver);
    }
}