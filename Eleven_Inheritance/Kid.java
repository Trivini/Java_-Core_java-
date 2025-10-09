package Eleven_Inheritance;

public class Kid implements Mom, Dad {

    public void hasGold(){
        System.out.println("has Gold");
    }

    public void hasHouse(){
        System.out.println("Has House");
    }

    public static void main(String[] args) {
        Kid kid = new Kid();
        kid.hasGold();
        kid.hasHouse();
    }

    
}
