package COREJAVAConcepts;

public class MethodEx1 {
	
	
	int X = 10;         //Object: instance variable ---static keyword XX and outside main method
	static int Y =20;  //class Name  static variable ---- with static keyword and out side main method
	

	public void add2Numbers() {  // Instance method or Non-Static method  :  object needed
		int A = 10;
		int B = 20;
		System.out.println(A + B);
	}
	
	public static void sub2Numbers() {   // Static Method:   Class Name
		int A = 10;
		int B = 20;
		System.out.println(B - A);
	}
	
	public static void main(String[] args) {
	
		MethodEx1  obj = new MethodEx1();
		
		System.out.println(obj.X);
		System.out.println(MethodEx1.Y);
		
	    obj.add2Numbers();
	    MethodEx1.sub2Numbers();
	   
	

	}

}
