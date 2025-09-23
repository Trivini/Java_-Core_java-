package Control_Statements;

import java.util.Scanner;
public class Looping_Statements {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //Without loop
        //greet

        //10 times
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        
        System.out.println("=========================");

        //With loop
        //for loop - Used when number of iterations/repetations  are know in advance
        
        //forward
        for(int i = 0;i<10;i++){
            System.out.println("Good Morning");
        }
        

        System.out.println("==========================");

        //backward

        for(int count =5;count>=1;count--)
        {
            System.out.println(count);
        }

        System.out.println("===========================");

        //while loop - used when we don't know the number of iteration/repetations in advance

        int count = 1;
        while (count<=5) {
            System.out.println(count);
            count++;
        }

        System.out.println("============================");

        //check the phone passcode

        int correctPin = 8767;
        int enteredPin = 0;
        while (enteredPin!=correctPin) {
            
            System.out.println("Enter the phone Passcode:");
            enteredPin = sc.nextInt();
        }
         
        System.out.println("Phone is Unlocked");

        System.out.println("============================");

        //do-while - Similar to the while, but run the code at least once before checking the condition

        int ct = 7;
        do{
            System.out.println(ct);
            ct++;
        }
        while(ct<=5);

        System.out.println("============================");

        //while-while loop (nested while loop)

        int outer = 3;
        while (outer<=5) {
            int inner = 1;
            while (inner<=3) {
                System.out.println(outer + " X " + inner+" = " + (outer * inner));
                inner++;
            }
            outer++;
            
        }

        


    }
    
}
