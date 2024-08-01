public class CreditCard implements PaymentStrategy{
    @Override
    public void print(int amount){
        System.out.println("Amount " + amount + " paid using Credit Card.");
    }
}