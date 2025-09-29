package Static;

public class Check {

    //static variable
    public static String data;

    //instance variable
    public String value;

    //Static block
    static{
        System.out.println("Static block Executed");
        data = "java";
    }

    //instance block
    {
        System.out.println("Instance block Executed");
        value = "Sakshi";
    }

    //constructor
    public Check(){
        System.out.println("Constructor is Executed...");
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Main Method is Executed");
       // System.out.println("Static data is:"+Check.data);
        Check c = new Check();
        System.out.println("Instance data is "+c.value);
    }
    
}
