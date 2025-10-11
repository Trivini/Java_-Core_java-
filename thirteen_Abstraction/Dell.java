package thirteen_Abstraction;

public class Dell implements Laptop{

	public void processorLogic(){
        System.out.println("i5 Processor");
    }

    public void ramLogic(){
        System.out.println("8 GB RAM");
    };

    public void screenLogic(){
        System.out.println("15 Inch Screen");
    };

    public void keyboardLogic(){
        System.out.println("Full Size Keyboard");
    };


    public void hardDiskLogic() {
        System.out.println("500 GB Hard Disk");
    }
}

