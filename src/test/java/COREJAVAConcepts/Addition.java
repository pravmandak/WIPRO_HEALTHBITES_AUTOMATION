package COREJAVAConcepts;

public class Addition {
	
	//VARIABLES  : To store temporary values
	int A = 10;
	int B = 20;
	int C = 30;
	
	//METHODS    : It is a block which stores a small piece of code
	public void addTwoNumbers ()  {
		System.out.println(A + B);
		
	}
	public void addThreeNumbers() {
		System.out.println( A + B + C);
	}
	
	public void subraction() {
		System.out.println(B - A);
	}
	
	public static void main(String[] args) {
		
		Addition   obj = new Addition();  //This will have the power to access the Variables & methods of that class
		Addition   obj2 = new Addition();  //This will have the power to access the Variables & methods of that class
		Addition   obj3 = new Addition();  //This will have the power to access the Variables & methods of that class
		
		obj.addTwoNumbers();   //30
		obj.addThreeNumbers(); //60
		obj.subraction();  //10
		
		System.out.println(obj.A);
		
		obj2.addTwoNumbers();
		obj2.addThreeNumbers();
		obj2.subraction();
		
		obj3.addTwoNumbers();
		obj3.addThreeNumbers();
		obj3.subraction();
		

	}

}
