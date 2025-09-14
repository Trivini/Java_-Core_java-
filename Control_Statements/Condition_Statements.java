package Control_Statements;

public class Condition_Statements {
    public static void main(String args[]){

        //if Statement
        //Examle 1

        int num1=10;
        if(num1>0){
            System.out.println(num1+" is positive");
        }

       // Example 2
        // check if given number is in range of 10 to 20
        int num2 = 17;
        if(num2>=10 && num2<=20){
            System.out.println(num2+" is in the range of 10 and 20");

        }


        //if-else
        //Example1 --> checking number is positive or negative

        int num3 = -10;
        if(num3>0)
        {
            System.out.println(num3+" is positive");
        }else{
            System.out.println(num3+" is negative");
        }



        //Example 2 --> Check eligible or not for vote

        int age = 23;
        if(age>=18)
        {
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }

        //Ternary Operator
        //Example 1 --> check vote or not

        String result = (age>18)? "You can vote":"You cannot vote";
        System.out.println(result);


        //Example 2 - find maximum number

        int a =10;
        int b = 12;
        int max = (a>b)? 10:12;
        System.out.println("maximum number is:"+max);


        //else if ladder
        //Example 1- checking grade

        int marks = 15;
        if(marks>90){
            System.out.println("Student got grade A");
        }else if(marks>=80)
        {
            System.out.println("Student got grade B");
        }else if(marks>=75){
            System.out.println("Student got grade 'C");
        }
        else if(marks>=50){
            System.out.println("Student got grade 'D");
        }else
        {
            System.out.println("Student got grade 'E'");
        }


        //Switch case
        //Example 1: Checking day

        int dayNumber = 7;
        switch(dayNumber){
            case 1:
             System.out.println("Monday");
            break;

            case 2:
             System.out.println("Tuesday");
            break;

            case 3:
             System.out.println("Wednesday");
            break;

            case 4:
             System.out.println("Thrusday");
            break;

            case 5:
             System.out.println("Friday");
            break;

            case 6:
             System.out.println("Saturaday");
            break;

            case 7:
             System.out.println("Sunday");
            break;

            default:
             System.out.println("Invalid day");
            break;
        }


        //Example 2: Switch case with fall through

        int day = 6;

        switch(day){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
             System.out.println("Weekday");
            break;

            case 6:
            case 7:
             System.out.println("Weekend");
            break;

            default:
             System.out.println("Invalid day");
            break;
        }


    }



}
