package OOPs;

//import java.lang.reflect.Method;
import java.util.Scanner;

public class Student {

    int StudentID;
    String StudentName;
    int StudentAttendance;
    int Score;
    int trainer_rating;


    //Method to Show Student Info
    public void StudentInfo(){
    
        System.out.println("======== Student Details ========");
        System.out.println("Institute: "+LMS.instituteName);
        System.out.println("Student ID: "+StudentID);
        System.out.println("Student Name: "+StudentName);
    
    }


    //Method to calculate Credits based on Attendance
    public int AttendanceCeadits(){
        Scanner sc = new Scanner(System.in);
       // int credits = 0;
        System.out.println("Enter the Attendance of Student:");
        int sessions = sc.nextInt();

        if(sessions>=30){
            return 5;
        }else if(sessions>=20){
            return 3;
        }
        else{
            return 0;
        }
    }


    //Method to calculate Credits based on Score
    public int ScoreCeadits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score of Student:");
        int Score = sc.nextInt();

        if(Score>=85){
            return 5;
        }else if(Score>=60){
            return 3;
        }
        else{
            return 0;
        }

    }
    //Method  Calculate Final Achievement using credits above
    public void FinalAchievement(){
        int finalCredits = AttendanceCeadits()+ScoreCeadits();

        if(finalCredits>=10){
            System.out.println("GOOD");
        }else if(finalCredits>=8){
            System.out.println("BETTER");
        }
        else{
            System.out.println("IMPROVE");
        }
    }

    //Method to give rating by student
    public int trainer_Rating(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rating to Trainer");
        trainer_rating = sc.nextInt();

        if(trainer_rating>=5){
            return 5000;
        }
        else{
            return 0;
        }

    }

    
}
