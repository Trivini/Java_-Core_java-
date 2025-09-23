package OOPs;
import java.util.Scanner;
public class Trainer {
    int TrainerID;
    String Trainername;
    int Sessions_taken;

    // method to display trainer info
    public void showInfo() {
        System.out.println("======== Trainer Details ========");
        System.out.println("Institute: "+LMS.instituteName);
        System.out.println("Trainer ID: "+TrainerID);
        System.out.println("Trainer Name: "+Trainername);
    }
    

    //Method to calculate Session payment
    public void calculatePayment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Sessions taken:");
        int Sessions_taken = sc.nextInt();
        int SessionCost = 1500;
        int totalPayment =  Sessions_taken * SessionCost;

        //Student should rate
        Student s = new Student();
        System.out.println("Student giving rating");
        int bonus =  s.trainer_Rating();
        totalPayment = totalPayment+bonus;

        System.out.println("Total Payament of the Trainer is:"+totalPayment);

    }

    

    
}
