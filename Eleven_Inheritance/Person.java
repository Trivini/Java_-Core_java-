package Eleven_Inheritance;

public class Person {

    //parent for all entities like Student , Trainer etc

    //all common attributes
    int personID;
    String personName;
    int personAge;
    int personMobileNumber;

    //default constructor
    public Person(){

    }



    //Constructor
    public Person(int personID, String personName, int personAge, int personMobileNumber) {
        this.personID = personID;
        this.personName = personName;
        this.personAge = personAge;
        this.personMobileNumber = personMobileNumber;
    }

    //Display Complete Info(Click)
    public void PersonCompleteInfo(){
        System.out.println("========  Profile Complete Details ========");
        System.out.println("ID: "+personID);
        System.out.println("Name: "+personName);
        System.out.println("Mobile Number: "+personMobileNumber);
        System.out.println("Age: "+personAge);

    }



}
