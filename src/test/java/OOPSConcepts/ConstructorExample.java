package OOPSConcepts;

public class ConstructorExample {

	 ConstructorExample(int rollNumber, String name){
		System.out.println(rollNumber);
		System.out.println(name);
	}
	
	ConstructorExample(int rollNumber, String name, int fee){
		System.out.println(rollNumber);
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		
		ConstructorExample  obj = new ConstructorExample(123,"Praveen");
		
	
	}

}
