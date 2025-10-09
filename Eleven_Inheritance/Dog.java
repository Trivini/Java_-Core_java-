package Eleven_Inheritance;

public class Dog extends Animal {
    String animal = "Dog";

    public void display(){
        System.out.println("Dog displayed");
    }

    //child Specifica

    public void show(){
        display();  // current class display
        super.display();  // Parent class display
        System.out.println("Show current class Animal: "+animal);
        System.out.println("Show parent class Animal: "+super.animal);
    }
    
}
