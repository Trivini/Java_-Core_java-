package Control_Statements;

import java.util.Scanner;

public class nested_ifelse {

    public static void main(String args[]){
    //voting app

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your age:");
    int age = sc.nextInt();

    if(age>=18){
        System.out.println("Do you has ID: (Yes/no)");
        String has_id =sc.next();


        if(has_id=="Yes")
        {
            System.out.println("You can Vote");
        }
        else
        {
            System.out.println("You need ID");
        }
    }
    else{
        System.out.println("You are too young");
    }
        



}
    
}
