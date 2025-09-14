
import java.util.Scanner;

public class ScannerClass {
  public static void main(String args[])
  {
        Scanner input = new Scanner(System.in);

        String name;
        System.out.println("Enter your name:");
        name = input.next();
        System.out.println("Name is:"+name);

          

        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Age is:"+age);
  }
     
    
}
