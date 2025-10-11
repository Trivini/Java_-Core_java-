package thirteen_Abstraction;



import java.util.Scanner;

import Control_Statements.StudentManaSystem;
import OOPs.LMS;

public class Student extends AbstractPerson implements Payable, Personable {

    //static variable
    private static String instituteName;
    private static double globalDisscount;
    
    
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
    

    //instance data is encapsulated
    private int totalSessionsAttended;
    private int AttendanceCeadits;
    private int performanceCredits;
    private int finalCredits;
    private int trainer_rating;
    private double courseFees;
    private String coupon;

    

    //take input of 5 subject score(With array)
    //int [] subjectScore = new int[5];

    //take input of dyamic score(With array)
    private int [] subjectScore ;




    //Common Scanner
    Scanner sc = new Scanner(System.in);


    //setters and getters
    public double getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(double courseFees) {
        //validation of courseFess
        if(courseFees>0){
            this.courseFees = courseFees;
        }else{
            System.out.println("Invalid Course Fess");
        }
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }
    
    //implements setPersonDetails() --> from Personable
    public void setPersonDetails(){
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Enter ID:");
        setPersonID(sc.nextInt());

        System.out.println("Enter name:");
        setPersonName(sc.next());

        System.out.println("Enter Age:");
        setPersonAge(sc.nextInt());

        System.out.println("Enter Mobile Number:");
        setPersonMobileNumber(sc.nextInt());

        System.out.println("Enter Coupon:");
        setCoupon(sc.next());

        System.out.println("Enter Course Fess:");
        setCourseFees(sc.nextInt());

    }

    //implements displayPersonDetails() --> from Personable
    public void displayPersonDetails(){
        System.out.println("========  Profile Complete Details ========");
        System.out.println("ID: "+getPersonID());
        System.out.println("Name: "+getPersonName());
        System.out.println("Mobile Number: "+getPersonMobileNumber());
        System.out.println("Age: "+getPersonAge());

    }


   
    //calculate course Fee
     //implements calculatepayment() --> from Payable
    public void calculatePayment(){
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

