package COREJAVAConcepts;

public class ExceptionsExample {

	public static void main(String[] args) {
		
		
	/*	try {
			
		int A =100;
		System.out.println(A/0);  //Infinity  :here I have an exception
		
		} catch (ArithmeticException ex) {
			
		System.out.println("There is an exception but still I am moving next steps");
		}

		int B = 200;
		System.out.println (0/B); // Zero */
		
		
		int []  A = new int[4];  //0,1,2,3..... A[4]
		
		
		try {
			A[0] = 10;
			A[1] = 20;
			A[2] = 30;
			A[3] = 40;
			A[4] = 50;
		
		for(int i = 0; i<=A.length; i++) {
			
			System.out.println(A[i]);
			
		}
		
		} catch(ArrayIndexOutOfBoundsException  ex) {
			System.out.println("Add to cart not working");
			
		}
		
		finally {
			System.out.println("User successfully signed out and closed browser");
		}
		
	

		
		
	}

}
