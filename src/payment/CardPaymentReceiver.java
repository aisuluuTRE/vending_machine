package payment;

import java.util.Scanner;

public class CardPaymentReceiver extends PaymentReceiver {
    private String cardNumber;
    private String oneTimePassword;
    @Override
    public void acceptPayment(int amount) {
        System.out.println("Введите номер карты: ");
        cardNumber = new Scanner(System.in).nextLine();
        System.out.println("Введите одноразовый пароль: ");
        oneTimePassword = new Scanner(System.in).nextLine();
        System.out.println("Платеж через банковскую карту принят.");
    }
}
