package twelve_Encapsulation;

public class Test {

    public class publicInner{
        public void show(){
            System.out.println("Public Inner Class");

        }
    }
    
    protected class protectedInner{
        public void show(){
            System.out.println("Protected Inner Class");

        }
    }

    private class privateInner{
        public void show(){
            System.out.println("Private Inner Class");

        }
    }

    class defaultInner{
        public void show(){
            System.out.println("Default Inner Class");

        }
    }
}
