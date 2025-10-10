package twelve_Encapsulation;

import java.util.Scanner;

//package Constructors;

public class LMS {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        System.out.println("Enter ID:");
        s.setPersonID(sc.nextInt());

        System.out.println("Enter name:");
        s.setPersonName(sc.next());

        System.out.println("Enter Age:");
        s.setPersonAge(sc.nextInt());

        System.out.println("Enter Mobile Number:");
        s.setPersonMobileNumber(sc.nextInt());

        System.out.println("Enter Coupon:");
        s.setCoupon(sc.next());

        System.out.println("Enter Course Fess:");
        s.setCourseFees(sc.nextInt());

        //Institute Info
        Student.instituteInfo();
        
       

        //Click functionality
        s.PersonCompleteInfo();

        //CourseFees
        s.calculatecourseFees();

        
       //display session credits
       s.achievementStatus();

       
       s.calculatecourseFees();

        // trainer 
        Trainer t = new Trainer();
        System.out.println("Enter ID:");
        t.setPersonID(sc.nextInt());

        System.out.println("Enter name:");
        t.setPersonName(sc.next());

        System.out.println("Enter Age:");
        t.setPersonAge(sc.nextInt());

        System.out.println("Enter Mobile Number:");
        t.setPersonMobileNumber(sc.nextInt());

        

        // info of trainer
        t.PersonCompleteInfo();

        // trainer payment
        t.sessionsPayment();

    }

    
}

