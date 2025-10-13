package Fourteen_Polymorphism;

import java.util.Random;

public abstract class AbstractPayment implements Payment {


    private String transactionId;

    //abstract method for specific type of payment
    public abstract void prossesPayment(double amount);


    //generate Transaction ID after processing Payment
    public String getTransactionId(){
        Random randomId = new Random();
        transactionId = "TX-ID-"+randomId.nextInt(1000000);
        return transactionId;
    } 

    // Receipt Generation
    @Override
    public void generateReceipt(String transactionId){

        System.out.println("Receipt Generated For Transaction ID: "+transactionId);
    }



}
