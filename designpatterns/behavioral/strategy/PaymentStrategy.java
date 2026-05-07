package designpatterns.behavioral.strategy;

interface PaymentStrategy {

    boolean pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean pay(double amount) {
        // Credit card processing logic
        System.out.println("Paid " + amount + " with credit card");
        return true;
    }
}

class PayPalPayment implements PaymentStrategy {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public boolean pay(double amount) {
        // PayPal processing logic
        System.out.println("Paid " + amount + " with PayPal");
        return true;
    }
}

class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }
}
