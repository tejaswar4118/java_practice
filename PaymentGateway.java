public interface PaymentGateway {
    void initiatePayment(double amount);
    void cancelPayment();
}
public class PayPalPayment implements PaymentGateway {

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    @Override
    public void cancelPayment() {
        System.out.println("Cancelling PayPal payment");
    }
}
public class CreditCardPayment implements PaymentGateway {

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }

    @Override
    public void cancelPayment() {
        System.out.println("Cancelling Credit Card payment");
    }
}
public class PaymentService {

    public void makePayment(PaymentGateway gateway, double amount) {
        gateway.initiatePayment(amount);
    }

    public void cancelPayment(PaymentGateway gateway) {
        gateway.cancelPayment();
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        PaymentGateway paypal = new PayPalPayment();
        PaymentGateway creditCard = new CreditCardPayment();

        service.makePayment(paypal, 100.0);
        service.makePayment(creditCard, 250.0);

        service.cancelPayment(paypal);
    }
}
