package payment ;

public class PayPalPayment implements PaymentStrategy {
    String email ;

    public PayPalPayment(String email){
        this.email = email ;
    }

    @Override
    public void pay(double amount){
        System.out.println("amount paid :  " + amount) ;
        System.out.println("payment information :  " + this.getPaymentDetails() ) ;
        System.out.println() ;
    }

    @Override
    public String getPaymentDetails(){
        return "PayPalPayment" + "  " + this.email ;
    }
}
