package twelve_Encapsulation;

public class DemoPerson {

    public String publicName = "Public Name";
    private String privateName = "Private Name";
    protected String protectedName = "Protected Name";
    String defaultName = "Default Name";   // default means no access modifier

    public void display(){
        System.out.println("Inside the Same Class");
        System.out.println(publicName);
        System.out.println(privateName);
        System.out.println(protectedName);
        System.out.println(defaultName);
    }

    public static void main(String[] args) {
        System.out.println("Same package - Different Class");
        DemoPerson dp = new DemoPerson();
        System.out.println(dp.publicName);
        System.out.println(dp.privateName);  
        System.out.println(dp.protectedName);
        System.out.println(dp.defaultName);
    }
    
}
