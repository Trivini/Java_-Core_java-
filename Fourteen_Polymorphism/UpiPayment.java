package Fourteen_Polymorphism;

import java.util.Scanner;

public class UpiPayment extends AbstractPayment {
    private String upiId;
    private String upiType;


    public String getUpiId() {
        return upiId;
    }


    public void setUpiId(String upiId) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the UPI Id:");
        upiId = sc.next();
        this.upiId = upiId;
    }


    public String getUpiType() {
        return upiType;
    }


    public void setUpiType(String upiType) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the UPI Type Gpay / PhonePe / PayTM:");
        upiId = sc.next();
        this.upiType = upiType;
    }

    @Override
    public void prossesPayment(double amount) {
         System.out.println("Processing Netbanking Payment of Rupees:"+amount);
        
    }
    

}
