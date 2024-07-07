package COREJAVAConcepts;

public class ClassA {
	
	int A = 10;
	int B = 20;

	public static void main(String[] args) {
		
		
		ClassA objA = new ClassA();
		
		System.out.println(objA.A);
		System.out.println(objA.B);
		
		
		
		ClassC objC = new ClassC();
		
	   System.out.println(objC.M);
	   System.out.println(objC.N);
	   
	   
	   ClassB objB = new ClassB();
	   
	   System.out.println(objB.AA);
	   System.out.println(objB.YY);
	}

}
