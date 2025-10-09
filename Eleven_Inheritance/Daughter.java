package Eleven_Inheritance;

public class Daughter extends Father {
    public void hasBussines(){
        System.out.println("HAs Bussines");
    }

    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        daughter.hasHouse();
        daughter.hasLand();
        daughter.hasBussines();
        
        
    }
    
}
