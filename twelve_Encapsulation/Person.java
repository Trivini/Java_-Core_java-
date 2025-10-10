package twelve_Encapsulation;

public class Person {

    //parent for all entities like Student , Trainer etc

    //all common attributes
    private int personID;
    private String personName;
    private int personAge;
    private int personMobileNumber;

   

    public int getPersonID() {
        return personID;
    }



    public void setPersonID(int personID) {
        this.personID = personID;
    }



    public String getPersonName() {
        return personName;
    }



    public void setPersonName(String personName) {
        this.personName = personName;
    }



    public int getPersonAge() {
        return personAge;
    }



    public void setPersonAge(int personAge) {
        if(personAge>0){
            this.personAge = personAge;
        }else{
            System.out.println("Age is above 0");
        }
    }



    public int getPersonMobileNumber() {
        return personMobileNumber;
    }



    public void setPersonMobileNumber(int personMobileNumber) {
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
