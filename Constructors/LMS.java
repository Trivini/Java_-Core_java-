package Constructors;

public class LMS {

    public static void main(String args[]){

        Student s1 = new Student(101 , "Sakshi");

        Student s2 = new Student(201 , "Shinde", 989898, 23);

        //Hover Functionality
        s1.StudentInfo();

        //Click functionality
        s1.StudentCompleteInfo();

        //display session credits
        //System.out.println(s1.sessionsCredits());
       // System.out.println(s2.sessionsCredits());

       s1.achievementStatus();

        // trainer 
        Trainer t1 = new Trainer();
        t1.trainerID = 101;
        t1.trainerName = "John";

        // info of trainer
        t1.trainerInfo();

        // trainer payment
        t1.sessionsPayment();

    }

    
}
