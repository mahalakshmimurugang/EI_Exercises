public class Main{
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCard());
        cart.checkOut(500);

        cart.setPaymentStrategy(new PayPal());
        cart.checkOut(300);
    }
}
