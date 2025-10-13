package Fourteen_Polymorphism;

import java.util.Scanner;

public class NetBankingPayment extends AbstractPayment {

    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bank Name:");
        bankName = sc.next();
        this.bankName = bankName;
    }



    @Override
    public void prossesPayment(double amount) {
        System.out.println("Processing Netbanking Payment of Rupees:"+amount);
    }


}
