package Static;

import java.util.Random;

public class Demo {
    //instance data
    int number;

    public static void main(String[] args) {
        // System.out.println("Run");

        Demo d1 = new Demo();
        d1.number = new Random().nextInt();
        System.out.println("Number:"+d1.number);

        Demo d2 = new Demo();
        d2.number = new Random().nextInt();
        System.out.println("Number:"+d2.number);

        Demo d3 = new Demo();
        d3.number = new Random().nextInt();
        System.out.println("Number:"+d3.number);
    }
    
}
