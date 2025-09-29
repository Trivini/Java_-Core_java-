package Strings;

public class String_Immutability {
    public static void main(String[] args){
        String str = "hell";
        System.out.println(str.concat("o"));
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str.concat("o")));
        System.out.println(System.identityHashCode(str));
    }
    
}
