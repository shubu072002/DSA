package LSP_Example;

public class Test {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.paymentProcessor(new CreditCardPayment());
        paymentService.paymentProcessor(new UpiPayment());
    }
}
