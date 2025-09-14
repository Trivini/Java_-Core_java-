/*# Tution Fee Calculation (Variables, Data Types, Operators, Conditionals)

Student's grade level (1-12) 
Base tuition fee 
Discount percentage 
Academic Topper status (e.g., whether the student is an academic topper or not,

Determine the discount based on the following rules:

    -> For students in grades 9 to 12
        -> If they are academic toppers, apply a 20% discount.
        -> Otherwise, apply a 10% discount.
    -> For students in grades 6 to 8
        -> apply a 5% discount
    -> Below grade 6 
        -> No discount
    
    -> Apply Additional Discount
        -> For grade 10, add an additional 3% discount.
        -> For grade 12, add an additional 5% discount.
        -> No additional discounts for other grades.

    -> Calculate Actual Fee 
        -> Base Fee - Discount 
    
    -> Display Output
        -> Student Grade
        -> Student Base Fee 
        -> Discount Amount 
        -> Fee To Pay */

package Task2;
import java.util.Scanner;

public class TutionFeesCalculation {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        //Taking input from users

        System.out.println("Enter the grade of Student:");
        int grade = input.nextInt();

        System.out.println("Enter the base Tuition fees:");
        int base_fees = input.nextInt();

        System.out.println("Is the student an Academic Topper? (true/false):");
        boolean isTopper = input.nextBoolean();   

        //Calculation Of discount

        double discountPercent = 0;
        double discountAmount = base_fees * discountPercent;
        double actualFees = base_fees - discountAmount;

        //Applied conditions

        if (grade >= 9 && grade <= 12) {
            // Base discount
            if (isTopper) {
                discountPercent = 0.20;
            } else {
                discountPercent = 0.10;
            }

            // Extra discount
            if (grade == 10) {
                discountPercent = discountPercent+0.03;     //20% + 3% or 105 + 3%
            } else if (grade == 12) {
                discountPercent = discountPercent+0.05;     //20% + 5% or 10% + 5%
            }

        } else if (grade >= 6 && grade <= 8) {
            discountPercent = 0.05;                        //discount is 5%
        } else {
            discountPercent = 0.0;                         //no discount
        }

        
       // display Output

        System.out.println("Grade of Student: " + grade);
        System.out.println("Student base fee: " + base_fees);
        System.out.println("Is Academic Topper? " + isTopper);
        System.out.println("Discount applied: " + (discountPercent * 100) + "%");
        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Final Fee to Pay: " + actualFees);
    }
}
