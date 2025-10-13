package Fourteen_Polymorphism;

import java.util.Scanner;

//package Constructors;

public class LMS {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        Personable s = new Student();
        

        //Institute Info
        Student.instituteInfo();
        
       

        //Click functionality
        s.setPersonDetails();
        s.displayPersonDetails();

        //CourseFees
        ((Payable)s).calculatePayment();

        
       //display session credits
       s.achievementStatus();

       

        // trainer 
        Personable t = new Trainer();
    

        // info of trainer
        t.setPersonDetails();
        t.displayPersonDetails();

        // trainer payment
        ((Payable)t).calculatePayment();


    }

    
}

