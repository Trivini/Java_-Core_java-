package OOPs;

public class Employee {

    //static Variable
    static String CompanyName = "Digital Lync";

    //instace variable
    String empName;

    public void EmployeeDetails(){
        //local variable

        int sal = 10000;

        System.out.println(empName+" ears "+sal+" in "+CompanyName );
    }

    public static void main(String args[]){
        Employee emp = new Employee();
        emp.empName = "Sakshi";
        emp.EmployeeDetails();
    }
    
    
}
