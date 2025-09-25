package Strings;

import java.util.Scanner;

public class Aadhar {

    public static boolean validAadhar(String aadhar){
        if(aadhar==null){
            return false;
        }else{
            for(char c : aadhar.toCharArray()){
                if(!Character.isDigit(c)){
                    return false;
                }

        
            }
            return true;
        }
    }

    public static void main(String[] args){


       //Simulate aadhar Functionality
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh Aadhar Card number:");
        String aadhar = sc.next();

        if(validAadhar(aadhar)==true && aadhar.length()==12){
            System.out.println("Aadhar "+aadhar+" is Valid");

        }else{
            System.out.println("Aadhar "+aadhar+" is not Valid");
        }
    }
    
}
