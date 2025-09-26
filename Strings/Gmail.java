package Strings;

import java.util.Scanner;


public class Gmail {

    //simulate gmail functionality

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the E-mail:");
        String email = sc.next();


        System.out.println("Original E-mail: "+email);
        System.out.println("Formated E-mail:"+email.toLowerCase().concat("@gmail.com").strip());



        //validate the password change functionality

        System.out.println("Enter the Password:");
        String password_one = sc.next();

        System.out.println("Re- enter the Password:");
        String password_two = sc.next();

        if(password_one.equals(password_two)){
            System.out.println("Password Change Successsfully");
        }else{
            System.out.println("password Did not match");
        }


        //Simulate Valid Email

        String e_mail = email.toLowerCase().concat("@gmail.com").strip();
        if(e_mail.contains("@")){
            System.out.println("Email "+e_mail+" is Valid");
        }else{
            System.out.println("Email "+e_mail+" is not Valid");
        }
    }

}
