package Strings;

import java.util.Scanner;

public class Validation_call_currancy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //simulate the call rate/currancy based on the ISD code

        System.out.println("Enter the Mobile number with ISD code:");
        String number = sc.next();

        if(number.startsWith("+91")){
            System.out.println("Pay in Rupees");
        }else if(number.startsWith("+1")){
            System.out.println("Pay in Dollers");
        }else if(number.startsWith("+86")){
            System.out.println("Pay in Yaun");
        }else if(number.startsWith("+36")){
            System.out.println("Pay in Euros");
        }else{
            System.out.println("Invalid");
        }


        //simulate email backup end with
        System.out.println("Enter the source email:");
        String source_email = sc.nextLine();

        System.out.println("Enter the Destination email: ");
        String desti_email = sc.nextLine();

        if(source_email.endsWith("@gmail.com") && desti_email.endsWith("@gmail.com")){
            System.out.println("Backup in progress");
        }else{
            System.out.println("backup failed, Both should be same type");
        }

    }
    
}
