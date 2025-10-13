package Fourteen_Polymorphism;

import java.util.Scanner;

public class CardPayment extends AbstractPayment {

    private int cardNumber;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Card Number");
        cardNumber = sc.nextInt();
        this.cardNumber = cardNumber;
    }

    @Override
    public void prossesPayment(double amount) {
         System.out.println("Processing Netbanking Payment of Rupees:"+amount);
        
    }

}
