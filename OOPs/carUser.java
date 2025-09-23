package OOPs;

public class carUser {

    public static void main(String[] args) {

        //creating an object
        
        CarNevigator Mahindra = new CarNevigator();
        CarNevigator Maruti = new CarNevigator();

        //assign data
        Mahindra.color = "grey";
        Mahindra.brandModel = "XUV700";
        Mahindra.price = 25.14;

        //working with instance variable
        System.out.println(Mahindra.color);

        //working with local variable
        // System.out.println(Mahindra.rating);

        

        //display car
        System.out.println("Website : "+CarNevigator.website);  //accaess Static variable with class name
        Mahindra.displayInfo();
        Maruti.displayInfo();  //default value , if not initializes
        
    }
    
}
