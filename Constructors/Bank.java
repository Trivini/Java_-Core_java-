package Constructors;

public class Bank {

    //// if you want to create an account in HDFC Bank 
    // Account Can be Opened if minimum balance is 10000

    //initial account create with 
    double miniBalance;

    //set starup values

    public Bank(){
        System.out.println("===============HDFC=================");
        System.out.println("=======Creating HDFC Account=========");
        miniBalance = 10000;


        //service charges
        miniBalance-= 1500;
    }

    public double showBalance(){
        return miniBalance;
    }



   public static void main(String[] args) {
     Bank obj = new Bank();
     System.out.println(obj.showBalance());
   }
    
}
