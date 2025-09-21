package Constructors;

public class Overload {

    //Constructor Overload - based on input, should give different outcome
    //based on
      //--> number of parameters
      //--> type of parameters
      //--> order of parameters

    public Overload(int a, int b){
        System.out.println("Sum is:"+(a+b));
    }

    public Overload(double a, int b){
        System.out.println("Sum is:"+(a+b));
    }

    public Overload(int a, double b){
        System.out.println("Sum is:"+(a+b));
    }

    public Overload(int a, int b, int c){
        System.out.println("Sum is:"+(a+b+c));
    }

    public static void main(String[] args) {
        Overload obj = new Overload(5, 3.50);
        Overload obj1 = new Overload(3, 4);
        
    }
    
}
