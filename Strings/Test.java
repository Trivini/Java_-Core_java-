package Strings;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        String name = "Sakshi";

        // Test t1 ="Sakshi";
        // System.out.println(t1);

        System.out.println(name);

        Test t1 = new Test();
        System.out.println(t1);   //Address: Strings.Test@372f7a8d

        String s1 = new String();
        System.out.println(s1);   //gives empty String


        //Following example can help you to understand the memory management of Strings
        String str1 = "hello";
        String str2 = "hello";

        //String memory pool
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str1));

        /*if we keep same value in different then string will never kept in different address 
          System.out.println(System.identityHashCode(str1));798154996
          System.out.println(System.identityHashCode(str1));798154996
          798154996
        */

        System.out.println(str1==str2);


        //When we use new Keyword , always new memory block is created
        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        System.out.println(str3==str4);

        /*== with String compare object Address
          == with primitive compare values
          equals() methoos to String compare values
         */

         System.out.println(str1.equals(str2));
         System.out.println(str1.equals(str4));


    }
    
}
