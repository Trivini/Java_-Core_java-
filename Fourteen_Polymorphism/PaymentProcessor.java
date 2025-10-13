package Fourteen_Polymorphism;

public class PaymentProcessor {

    //Payment via Net Banking
    public void makePayment(double amount, String bankName){
        System.out.println("=====Net banking Payment=====");
        NetBankingPayment netbanking = new NetBankingPayment();
        System.out.println("Amont to Pay:"+amount);
        netbanking.prossesPayment(amount);
        netbanking.generateReceipt(netbanking.getTransactionId());
    }

    //Payment via card
    public void makePayment(double amount, int cardNumber){
        System.out.println("=====Card Payment=====");
        CardPayment cardpayment = new CardPayment();
        System.out.println("Amont to Pay:"+amount);
        cardpayment.prossesPayment(amount);
        cardpayment.generateReceipt(cardpayment.getTransactionId());
    }

    //Payment via UPI
    public void makePayment( double amount,String upiId, String upiType){
        System.out.println("=====UPI Payment=====");
        UpiPayment upiPayment = new UpiPayment();
        System.out.println("Amont to Pay:"+amount);
        upiPayment.prossesPayment(amount);
        upiPayment.generateReceipt(upiPayment.getTransactionId());
    }

}
