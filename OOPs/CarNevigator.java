package OOPs;
import java .util.Scanner;

//blueprint for car nevigator functionality

public class CarNevigator{

    //characteristics or variables
    //Instance variables
    String color;
    String brandModel;
    double price;

    //static variable
    static String website =  "car dekho";

    //car - details

    public void displayInfo(){
        int rating =4;   //local variable
        System.out.println("Car Color is:"+color);
        System.out.println("Car Model is:"+brandModel);
        System.out.println("Price of car is:"+price);
        System.out.println("car rating:"+rating);  
    }
}