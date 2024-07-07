package OOPSConcepts;

public class MethodOVLEx2 {
	
	// Method with ZERO parameters
	public void  add() {
		int X =10;
		int Y = 20;
		System.out.println(X + Y);
	}
	
	
   // Method with same name ONE Parameter [int datatype]
	public void add(int A) {
		System.out.println(A);	
	}
	
	// Method with same name ONE Parameter [double datatype]
	public void add(double D) {
		System.out.println(D);
	}
	
	// Method with same name ONE Parameter [string datatype]
		public void add(String S) {
			System.out.println(S);
		}
		

	
	//Method with TWO Parameter [int data type]
	public void add (int B, int C) {
		System.out.println(B + C);
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
