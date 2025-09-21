package Constructors;

public class ConstructorDemo {

    //some data - instance data
    int number;
    double decNumber;
    char ch;
    boolean value;


    //Default/Implicit Constructor
    public ConstructorDemo(){
        System.out.println("Default Constructure");
        System.out.println("Set my values for instance data");
        number = 1;
        decNumber = 3.76;
        ch = '$';
        value = true;

    }

    //Explicit/ parameterized constructor
    public ConstructorDemo(int intNumber , char charCh)
    {
        number = intNumber;
        ch = charCh;
            
    }




    //Normal Method
    public void Method(){
        System.out.println("Some Method");
    }

    public static void main(String args []){
        ConstructorDemo obj = new ConstructorDemo(); // constructor is called when object is created
        obj.Method();   //method always need to call explicitly

        System.out.println(obj.number);
        System.out.println(obj.decNumber);
        System.out.println(obj.ch);
        System.out.println(obj.value);

        System.out.println("===========================");
        ConstructorDemo obj2 = new ConstructorDemo();

        System.out.println(obj2.number);
        System.out.println(obj2.decNumber);
        System.out.println(obj2.ch);
        System.out.println(obj2.value);

        System.out.println("==============================");

        ConstructorDemo obj3 = new ConstructorDemo(34 , '&');
        System.out.println(obj3.number);
        System.out.println(obj3.ch);

        System.out.println("=================================");

        ConstructorDemo obj4 = new ConstructorDemo(76 , '%');
        System.out.println(obj4.number);
        System.out.println(obj4.ch);





    }



    
}
