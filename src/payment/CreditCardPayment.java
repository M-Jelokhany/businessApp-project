package payment ;

public class CreditCardPayment implements PaymentStrategy{
    String cardNumber ;
    String cardHolderName ;

    public CreditCardPayment(String cardNumber , String cardHolderName){
        this.cardNumber = cardNumber ;
        this.cardHolderName = cardHolderName ;
    }

    @Override
    public void pay(double amount){
        System.out.println("amount paid :  " + amount) ;
        System.out.println("payment information :  " + this.getPaymentDetails() ) ;
        System.out.println() ;
    }

    @Override
    public String getPaymentDetails(){
        return "CreditCardPayment" + "  " + this.cardHolderName + "  " + this.cardNumber ;
    }
}
