package OOPs;

public class LMS {

    // static variable
    public static String instituteName = "Edify";


    public static void main(String args[]){
        //Student Identity
        Student s = new Student();
        s.StudentID = 101;
        s.StudentName = "Sakshi";

        //Display Student Info
        s.StudentInfo();

        //Stduent Achievement
        s.FinalAchievement();


        //trainer Identity
        Trainer t = new Trainer();
        t.TrainerID = 201;
        t.Trainername = "Ravi";

        //Trainer Info
        t.showInfo();
        

        // trainer payment
        t.calculatePayment();
    }
    
}
