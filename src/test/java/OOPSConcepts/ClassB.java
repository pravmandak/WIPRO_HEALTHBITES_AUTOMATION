package OOPSConcepts;


public class ClassB extends ClassA {
	
	int C = 500;
	int D = 100;
	
	public void mul() {
		System.out.println(C * D);
	}
	
	public void div() {
		System.out.println(C/D);
	}

	public static void main(String[] args) {

		ClassB  objB = new ClassB();	
		
		
		System.out.println(objB.C);
		System.out.println(objB.D);
		objB.mul();
		objB.div();

		System.out.println(objB.A);
		System.out.println(objB.B);
		objB.add();
	    objB.sub();
	}

}
