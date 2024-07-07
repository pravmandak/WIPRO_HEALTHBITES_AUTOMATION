package OOPSConcepts;

public class MethodOverLoadingExample {
	
	  int A = 10;
	  int B = 20;
	  
	  
	  // This is add()  method with ZERO parameters 
	  public void add() {
		  System.out.println(A + B);
	  }
	
	  //This is sub() method with ZERO parameters
	  public void sub() {
		  System.out.println(A - B);
	  }
	   
	  //This is add() method  with ONE parameter
	  public void add(int X) {  
		System.out.println(X);
	
	  }
	  
	  //This is add() method  with TWO parameter
	  public void add(int X, int Y) {  
		System.out.println(X);
		System.out.println(Y);
	
	  }
	  
	 //This is add() method  with THREE parameter
	  public void add(int X, int Y, int Z) {  
		System.out.println(X);
		System.out.println(Y);
		System.out.println(Z);
	  }

	public static void main(String[] args) {
		MethodOverLoadingExample   obj = new MethodOverLoadingExample();
		
		obj.add();
		obj.add(10);
		obj.add(20, 30);
		obj.add(100, 200, 300);

	}

}
