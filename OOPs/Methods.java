package OOPs;

public class Methods {
    //very simple method
    public void greet(){
        System.out.println("Good Morning");
    }

    public int add(){
        int a = 10;
        int b = 20;

        return a+b;
    }

    public int dyanamicAdd(int a , int b){
        return a+b;

    }


    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.greet();

        System.out.println(obj.add());

        System.out.println(obj.dyanamicAdd(4,5 ));
    }
    
}
