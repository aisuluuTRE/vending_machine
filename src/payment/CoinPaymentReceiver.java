package payment;

import java.util.Scanner;

public class CoinPaymentReceiver extends PaymentReceiver {
    private int amount;
    @Override
    public void acceptPayment(int amount) {
        System.out.println("Бросьте монеты в монетоприемник.");
        System.out.print("Введите количество монет: ");
        amount = new Scanner(System.in).nextInt();
        int productPrice = 100;
        if (amount >= productPrice) {
            System.out.println("Платеж через монетоприемник принят.");
        } else {
            System.out.println("Недостаточно монет для оплаты товара.");
        }
    }
}

