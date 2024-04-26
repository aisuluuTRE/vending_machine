import payment.CoinPaymentReceiver;
import payment.PaymentReceiver;


public class Main {
    public static void main(String[] args) {

        PaymentReceiver paymentReceiver = new CoinPaymentReceiver();
        AppRunner.run(paymentReceiver);
    }
}