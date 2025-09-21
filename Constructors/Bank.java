package Constructors;

public class Bank {

    //// if you want to create an account in HDFC Bank 
    // Account Can be Opened if minimum balance is 10000

    // now we can accept bank account with custom balance 2000, 5000, 0

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

    // savings account
    public Bank(double minBalance) {
        this.miniBalance = minBalance;
    }

    public double showBalance(){
        return miniBalance;
    }



   public static void main(String[] args) {
     Bank obj1 = new Bank();
     System.out.println(obj1.showBalance());

     Bank obj2 = new Bank(5000);
     System.out.println(obj2.showBalance());
   }
    
}
