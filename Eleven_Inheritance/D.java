package Eleven_Inheritance;

public class D implements B, C {

    public void featureD(){
        System.out.println("Feature D");
    }

    public void featureA() {
		// Implementation for featureA
		System.out.println("featureA implemented in D");
	}
	
	
	public void featureB() {
		// Implementation for featureB
		System.out.println("featureB implemented in D");
	}

	
	public void featureC() {
		// Implementation for featureC
		System.out.println("featureC implemented in D");
	}

    public static void main(String[] args) {
        D d = new D();
        d.featureD();
        d.featureA();
        d.featureB();
        d.featureC();
        
    }
}
