package linkedList;

interface PaymentGateway {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {

        System.out.println("Processing credit card payment of $" + amount + " with card number " + cardNumber);

    }
}

class PayPalPayment implements PaymentGateway {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {

        System.out.println("Processing PayPal payment of $" + amount + " with email " + email);

    }
}

public class CreditCardPayment1 {
    public static void main(String[] args) {

        PaymentGateway creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentGateway payPalPayment = new PayPalPayment("example@email.com");

        double amount = 100.0;

        creditCardPayment.processPayment(amount);
        payPalPayment.processPayment(amount);
    }
}
