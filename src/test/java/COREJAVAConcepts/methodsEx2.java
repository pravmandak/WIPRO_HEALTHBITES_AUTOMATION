package COREJAVAConcepts;

public class methodsEx2 {
	
	//A B INSTACNE VARIABLES
	int A = 10;
	int B = 20;
	
	public void add() {
		System.out.println(A + B);
	}
	
	public void sub () {
		int X =30;  //LOCAL VARIABLES TO THIS METHOD ONLY
		int Y = 50; 
		System.out.println(Y-X);
	}

	public static void main(String[] args) {
		
		
		methodsEx2  obj  = new methodsEx2();
		
		obj.add();
		obj.sub();
		
		System.out.println(obj.A);
		System.out.println(obj.B);
		

	}

}
