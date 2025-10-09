package Eleven_Inheritance;

public class Son extends Father {

    public void hasCar(){
        System.out.println("has car");
    }
    public static void main(String[] args) {
        Son son = new Son();
        son.hasHouse();   //Single Inheritance
        son.hasLand();   // Multilevel Inheritance
        son.hasCar();      // own Feature
    }
    
}
