package thirteen_Abstraction;

import java.util.Scanner;

public class Trainer extends AbstractPerson implements Personable, Payable {

    private static int basePayPerSession= 1500;
    private int totalSessionsTaken;
    private int paymentForSessions;
    private int trainingBonus;
    private int totalPayment;


    public int getTotalSessionsTaken() {
        return totalSessionsTaken;
    }


    public void setTotalSessionsTaken(int totalSessionsTaken) {
        this.totalSessionsTaken = totalSessionsTaken;
    }


    public int getPaymentForSessions() {
        return paymentForSessions;
    }

    public void setPaymentForSessions(int paymentForSessions) {
        this.paymentForSessions = paymentForSessions;
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

    }

    //implements displayPersonDetails() --> from Personable
    public void displayPersonDetails(){
        System.out.println("========  Profile Complete Details ========");
        System.out.println("ID: "+getPersonID());
        System.out.println("Name: "+getPersonName());
        System.out.println("Mobile Number: "+getPersonMobileNumber());
        System.out.println("Age: "+getPersonAge());

    }

    // Calculate Trainer Payment
     //implements calculatepayment() --> from Payable
    public void calculatePayment(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Total Sessions Taken: ");
       totalSessionsTaken = sc.nextInt();
       paymentForSessions = basePayPerSession*totalSessionsTaken;
       Student s1 = new Student(); // assigning rating
       System.out.println("=======Student Rating=======");
       trainingBonus = s1.trainerRatings();
       totalPayment = paymentForSessions+trainingBonus;
       System.out.println("=======Trainer Payment=======");
       System.out.println("Total Trainer Payment: "+totalPayment);
    }

} 
    

