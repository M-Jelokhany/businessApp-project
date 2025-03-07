import payment.* ;

public class Main {
    public static void main(String[] args) {
        PremiumCustomer ali = new PremiumCustomer("ali") ;
        RegularCustomer reza = new RegularCustomer("reza") ;
        RegularCustomer farhad = new RegularCustomer("farhad") ;

        CreditCardPayment creditCard = new CreditCardPayment("4486121700568954", "ali") ;
        PayPalPayment payPal = new PayPalPayment("mhmdmhdulshkhany8@gmail.com") ;
        BitcoinPayment bitcoin = new BitcoinPayment("1Mmi03dv34fx0000p34vjmD") ;

        ali.displayCustomerInfo() ;
        reza.displayCustomerInfo() ;
        farhad.displayCustomerInfo() ;

        ali.makePayment(creditCard , 1000) ;
        ali.makePayment(creditCard , 2000) ;
        reza.makePayment(payPal , 1000) ;
        reza.makePayment(payPal , 2000) ;
        farhad.makePayment(bitcoin , 1000) ;
        farhad.makePayment(bitcoin , 2000) ;

        ali.showPaymentHistory() ;
        reza.showPaymentHistory() ;
        farhad.showPaymentHistory() ;
    }
}