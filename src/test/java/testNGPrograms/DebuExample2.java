package testNGPrograms;

public class DebuExample2 {
	
	int X =100;
	int Y = 200;
		
	public void sub() {
		System.out.println(Y-X);
	}
	
	public void mul() {
		int X = 500;
		System.out.println(X * 5);
	}
	

	public static void main(String[] args) {

		DebuExample2  obj = new DebuExample2();
		
		int A = 10;   //10
		int B = 20;   //20
		
		System.out.println(A + B);  // 30
		
		obj.sub();   // 100
		obj.mul();   // 2500
		
		

	}

}
