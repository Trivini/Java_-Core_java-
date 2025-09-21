package Constructors;

public class Demo {

    int x;
    int y;

    public Demo(){
        x = 100;
        y = 200;
    }

    public Demo(int x , int y){
        this.x = x;
        this.y =y;
    }

    public int addNum(){
        return x+y;
    }

    public static void main(String args[]){
        Demo obj = new Demo(200, 300);

        System.out.println("Sum is:"+obj.addNum());
    }
    
}
