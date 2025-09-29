package Strings;

public class Compare {

    //Strings vs String Builder vs String Buffer

    public static void main(String[] args) {
        //String

        long StringStartTime = System.currentTimeMillis();
        String str = "Good";

        for(int i = 0; i < 10000; i++){
            str = str.concat("Morning");
        }
        long StringEndTime = System.currentTimeMillis();
        System.out.println("Time taken by the Strings:"+(StringEndTime-StringStartTime));


        //String Builder

        long StartTimeStringBuilder = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Good");

        for(int i = 0; i < 10000; i++){
            builder = builder.append("Morning");
        }
        long EndTimeStringBuilder = System.currentTimeMillis();
        System.out.println("Time taken by the Strings builder:"+(EndTimeStringBuilder-StartTimeStringBuilder));


        //String Buffer

        long StartTimeStringBuffer = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Good");

        for(int i = 0;i < 10000; i++){
            buffer = buffer.append("Morning");
        }
        long EndTimeStringBuffer = System.currentTimeMillis();
        System.out.println("Time taken by the Strings buffer:"+(EndTimeStringBuffer-StartTimeStringBuffer));

    }
    
}
