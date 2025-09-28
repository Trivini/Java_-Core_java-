package Arrays;

public class Demo {

    public static void main(String[] args){
        //datatype [] variable_name = new datatype[size];

        int [] num = new int[5];   //1,2, 3, 4, 5
        String [] text = new String[5];    //"one", "two", "three", "four", "five"

        //Assign data
        num[0] = 1;
        num[2] = 3;

        System.out.println(num);  //memmory address
        System.out.println(num[2]);

        // num[10] = 100;
        // System.out.println(num[10]);     //Index 10 out of bounds for length 5

        //Array with direct initializatin

        int[] number = {10,20,37,40,55,60,70,80};

        System.out.println(number[0]);
        System.out.println(number[6]);
        System.out.println(number.length);

        //get all elements
        for(int i = 0;i<number.length;i++){
            System.out.println(number[i]);
        }

        //perform the operations
        for(int i = 0;i<number.length;i++){
            if(number[i]%2==0){
                System.out.println("Even elements are:"+number[i]);
            }
        }
        int total = 0;
        for(int i = 0;i<number.length;i++){
            total = total+number[i];
    
        }
        System.out.println(total);
        int avg = total/number.length;
        System.out.println(avg);








    }
    
}
