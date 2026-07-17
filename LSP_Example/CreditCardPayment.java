package LSP_Example;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " +amount+" using credit card");
    }
}
