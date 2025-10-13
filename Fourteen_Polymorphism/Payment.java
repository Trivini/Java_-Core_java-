package Fourteen_Polymorphism;

public interface Payment {

    //contract for processing payment
    public void prossesPayment(double amount);


    //contract for generating receipt
    public void generateReceipt(String transactionId);

}
