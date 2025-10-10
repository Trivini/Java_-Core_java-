package Operatoes;

import twelve_Encapsulation.DemoPerson;

public class SubClassTest extends twelve_Encapsulation.DemoPerson {
    public static void main(String[] args) {
        SubClassTest dp = new SubClassTest();
        System.out.println("Different Package - Sub Class ");
        System.out.println(dp.publicName); 
        System.out.println(dp.protectedName); 
        // System.out.println(dp.defaultName); // Not Visible / Accessible 
        // System.out.println(dp.privateName); // Not Visible / Accessible 

    }
}
