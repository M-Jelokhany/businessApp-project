package payment ;

public class BitcoinPayment implements PaymentStrategy{
    String walletAddress ;

    public BitcoinPayment(String walletAddress){
        this.walletAddress = walletAddress ;
    }

    @Override
    public void pay(double amount){
        System.out.println("amount paid : " + amount) ;
        System.out.println("payment information :  " + this.getPaymentDetails() ) ;
        System.out.println() ;
    }

    @Override
    public String getPaymentDetails(){
        return "BitcoinPayment" + "  " + this.walletAddress ;
    }
}
