package Eleven_Inheritance;

import java.util.Scanner;

public class Trainer extends Person {

    
    int totalSessionsTaken;
    int paymentForSessions;
    int trainingBonus;
    int totalPayment;

    //click Constructor
    public Trainer(int trainerID , String trainerNameName, int trainerMobileNumber, int trainerAge){
        //below line call parent class constructor
        super(trainerID ,trainerNameName, trainerMobileNumber,trainerAge );
        
    }


    


    // Calculate Trainer Payment
    public void sessionsPayment(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Total Sessions Taken: ");
       totalSessionsTaken = sc.nextInt();
       paymentForSessions = 1500*totalSessionsTaken;
       Student s1 = new Student(); // assigning rating
       System.out.println("=======Student Rating=======");
       trainingBonus = s1.trainerRatings();
       totalPayment = paymentForSessions+trainingBonus;
       System.out.println("=======Trainer Payment=======");
       System.out.println("Total Trainer Payment: "+totalPayment);
    }

} 
    

