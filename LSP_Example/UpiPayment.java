package LSP_Example;

public class UpiPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using upi");
    }
}
