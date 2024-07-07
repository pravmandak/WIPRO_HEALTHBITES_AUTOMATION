package COREJAVAConcepts;

public class methodsEx3 {
	
	
	//We need object to create to access NON-STATIC methods
	public void indiaCapital() {
		System.out.println("Delhi");
	}
	
	public void  australiCapital() {
		System.out.println("Sydney");
	}
	
	
	//STATIC METHODS no object creation is required : Directly we can access them my class Name
	public static void USCapital() {
		System.out.println("WashingtonDC");

	}
	
	public static void SrilankaCapital() {
		System.out.println("Colombo");
	}
	
	
	public static void main(String[] args) {
		
		methodsEx3.USCapital();
		methodsEx3.SrilankaCapital();
		
		methodsEx3 obj = new methodsEx3();
		
		obj.australiCapital();
		obj.indiaCapital();
		
		
	
	}

}
