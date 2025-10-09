package Eleven_Inheritance;



import java.util.Scanner;

import Control_Statements.StudentManaSystem;
import OOPs.LMS;

public class Student extends Person {

    //static variable
    public static String instituteName;
    public static double globalDisscount;
    
    
    //static block for initializing the statc variable
    static{
        instituteName = " Digital Edify";
        globalDisscount = 0.1;  // i.e. 10 %
    }

    //Static method to work with static block
    public static void instituteInfo(){
        System.out.println("=======Institute Info========");
        System.out.println("Institute Name is:"+instituteName);
        System.out.println("We have disscount for everyone:"+(globalDisscount*100));
    }
    

    
    int totalSessionsAttended;
    int AttendanceCeadits;
    int performanceCredits;
    int finalCredits;
    int trainer_rating;
    double courseFees;
    String coupon;

    

    //take input of 5 subject score(With array)
    //int [] subjectScore = new int[5];

    //take input of dyamic score(With array)
    int [] subjectScore ;



    //We can used constructor
    public Student(){
        System.out.println("Default Constructor");
    }

    //hover Constructor
    // public Student(int StudentID, String StudentName){
    //     this.StudentID = StudentID;
    //     this.StudentName = StudentName;

    // }

    //click Constructor
    public Student(int StudentID , String StudentName, int studentMobileNumber, int studentAge, double courseFees, String coupon){
        //below line call parent class constructor
        super(StudentID, StudentName, studentMobileNumber,studentAge );
        this.courseFees = courseFees;
        this.coupon = coupon;
    }

    //hover
    public Student(int StudentID, String StudentName){
       //this();  //Default Constructor
        this(101,"Sakshi",989898, 23, 50000, "PROMO");
    }
    

    //Common Scanner

    Scanner sc = new Scanner(System.in);

    

   
    //calculate course Fee
    public void calculatecourseFees(){
        double disscount = 0;
        //if coupon is PROMO apply 5000
        //if coupon is FIFTY apply 25000
        String couponApplied = coupon;
        if(coupon.equals("PROMO")){
            disscount =  5000;
        }else if(coupon.equals("FIFTY")){
            disscount =  25000;
        }
        else{
            disscount =  0;
        }

        double finalFees = courseFees - disscount;

        //apply global Disscount
        double gd = finalFees * globalDisscount;


        System.out.println("Actual Fee:"+courseFees);
        System.out.println("Disscount Applied via CUPON:"+disscount);
        System.out.println("Global Disscount Applied:"+gd);
        System.out.println("Fees to pay:"+(finalFees-gd));


    }

    //calculate Attendance Credits
    public int sessionsCredits(){
        System.out.println("Enter the number of Sessions Attended:");
        totalSessionsAttended = sc.nextInt();
        if(totalSessionsAttended>=30){
            return AttendanceCeadits = AttendanceCeadits+5;
        }else if(totalSessionsAttended>=20){
            return AttendanceCeadits = AttendanceCeadits+3;
        
        }else{
            return AttendanceCeadits = 0;
        }

    }

    //calculate average of Score of subjects
    public int calculateAverageScore(){
        System.out.println("Enter the number of Subjects:");
        int numSubjects = sc.nextInt();
        subjectScore = new int[numSubjects]; 
        int sum =0;
        for(int i =0;i<subjectScore.length;i++){
            System.out.println("Enter the Score Subject: "+(i+1));
            subjectScore[i] = sc.nextInt();

            sum = sum+subjectScore[i];
        }
        System.out.println("Total Score:"+sum);
        System.out.println("Number of Subjects: "+subjectScore.length);

        //calulate average

        int averageScore = sum/subjectScore.length;
        return averageScore;
    }

    //calculate Performance Credits
    public int scoreCeadits(int averageScore){
        
        if(averageScore>=85){
            return performanceCredits = performanceCredits+5;

        }else if(averageScore>=60){
            return performanceCredits = performanceCredits+3;
        }else{
            return performanceCredits = 0;
        }
    }

    //calculate Achievement
    public void achievementStatus(){
        int averageScore= calculateAverageScore();
        System.out.println("Average Score:"+averageScore);
        finalCredits = scoreCeadits(averageScore)+ sessionsCredits();
        if(finalCredits>=10){
            System.out.println("****A****");
        }else if(finalCredits>=8){
            System.out.println("****B****");
        }else{
            System.out.println("You Nedd To Improve");
        }

    }

    //calculate Trainer rating
    public int trainerRatings(){
        System.out.println("Enter the Trainer rating : 1-5");
        trainer_rating = sc.nextInt();

        if(trainer_rating>=5){
            //set bonus as 5000
            return 5000;
        }else{
            //no bonus
            return 0;
        }
    }

    
}

