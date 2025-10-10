package twelve_Encapsulation;

public class SamePackageTest {

    public static void main(String[] args) {
        System.out.println("Same package - Different Class");
        DemoPerson dp = new DemoPerson();
        System.out.println(dp.publicName);
       // System.out.println(dp.privateName);  //Not visible
        System.out.println(dp.protectedName);
        System.out.println(dp.defaultName);
    }
    
}
