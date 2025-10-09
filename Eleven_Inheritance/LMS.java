package Eleven_Inheritance;

 
//package Constructors;

public class LMS {

    public static void main(String args[]){

        Student s1 = new Student(101 , "Sakshi");

        Student s2 = new Student(201 , "Shinde", 989898, 23, 50000, "FIFTY");

        //Institute Info
        Student.instituteInfo();
        
       

        //Click functionality
        s1.PersonCompleteInfo();

        //CourseFees
        s1.calculatecourseFees();

        
       //display session credits
       s1.achievementStatus();

       
       s2.calculatecourseFees();

        // trainer 
        Trainer t1 = new Trainer(104, "John,", 8888888, 40);
        

        // info of trainer
        t1.PersonCompleteInfo();

        // trainer payment
        t1.sessionsPayment();

    }

    
}

