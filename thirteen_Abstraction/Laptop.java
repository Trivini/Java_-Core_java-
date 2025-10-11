package thirteen_Abstraction;

public interface Laptop {

    //Government given contract/guidelines

    //concrete method
    // public void show(){
    //     System.out.println("Laptop");
    // }
    

    //abstract method
    public void processorLogic();
    public void ramLogic();
    public void hardDiskLogic();
    public void screenLogic();
    public void keyboardLogic();

    //new contract added     --> from java 8 some special methods are added into interface
    default void bioMetricLogic(){
        System.out.println("Government providing bio Metric");
    }
}
