package thirteen_Abstraction;

public class User {
    public static void main(String[] args) {

        // Last Session -> Person -> Student & Trainer 

        Lenovo lenovo = new Lenovo();  // No abstraction
        lenovo.processorLogic();
        lenovo.hardDiskLogic();
        lenovo.keyboardLogic();
        lenovo.ramLogic();
        lenovo.screenLogic();
        lenovo.bioMetricLogic();
        

        Laptop dell = new Dell(); // Abstraction Achieved -> Why is this valid ? -> Inheritance 
        dell.processorLogic();
        dell.hardDiskLogic();
        dell.keyboardLogic();
        dell.ramLogic();
        dell.screenLogic();
        dell.bioMetricLogic();
    }
}
