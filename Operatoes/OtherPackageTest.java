package Operatoes;
import twelve_Encapsulation.DemoPerson;

public class OtherPackageTest {

    public static void main(String[] args) {
       
        
        System.out.println("Different package - Different Class");
        DemoPerson dp = new DemoPerson();
        System.out.println(dp.publicName);
        // System.out.println(dp.privateName);   // Not Visible / Accessible
        // System.out.println(dp.protectedName);  // Not Visible / Accessible
        // System.out.println(dp.defaultName);   // Not Visible / Accessible
    

    }

    
}
