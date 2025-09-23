package Constructors;

import java.util.Scanner;

import Control_Statements.StudentManaSystem;
import OOPs.LMS;

public class Student {

    int StudentID;
    String StudentName;
    int totalSessionsAttended;
    int AttendanceCeadits;
    int performanceCredits;
    int finalCredits;
    int trainer_rating;
    int studentMobileNumber;
    int studentAge;


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
    public Student(int StudentID , String StudentName, int studentMobileNumber, int studentAge){
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.studentMobileNumber = studentMobileNumber;
        this.studentAge = studentAge;
    }

    //hover
    public Student(int StudentID, String StudentName){
       //this();  //Default Constructor
        this(101,"Sakshi",989898, 23);
    }
    

    //Common Scanner

    Scanner sc = new Scanner(System.in);

    //Method to Show Student Info(hover)
    public void StudentInfo(){
    
        System.out.println("======== basic Student Details ========");
        System.out.println("Student ID: "+StudentID);
        System.out.println("Student Name: "+StudentName);
    
    }

    //Display Complete Info(Click)
    public void StudentCompleteInfo(){
        System.out.println("========  Student Complete Details ========");
        System.out.println("Student ID: "+StudentID);
        System.out.println("Student Name: "+StudentName);
        System.out.println("Student Name: "+studentMobileNumber);
        System.out.println("Student Name: "+studentAge);

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

    //calculate Performance Credits
    public int scoreCeadits(int score){
        if(score>=85){
            return performanceCredits = performanceCredits+5;

        }else if(score >=60){
            return performanceCredits = performanceCredits+3;
        }else{
            return performanceCredits = 0;
        }
    }

    //calculate Achievement
    public void achievementStatus(){
        finalCredits = scoreCeadits(95)+ sessionsCredits();
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
