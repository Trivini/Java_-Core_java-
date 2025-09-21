package Control_Statements;

public class Branching_Statement{
    public static void main(String args[])
    {
        //break - used in loop , which is used ti terminate the loop

        for(int i = 1;i<=5;i++){
            if(i==3){
                break;
            }

            System.out.println(i);

        }

        System.out.println("========================");

        //continue - used to terminate the current iteration

        for(int i = 1;i<=5;i++){
            if(i==3)
            {
                continue;
            }
            System.out.println(i);
        }


        //return - used to return the value

        System.out.println(addNum(200,300));
    }

    public static int addNum(int a, int b)
    {
        return a+b;
    }
}