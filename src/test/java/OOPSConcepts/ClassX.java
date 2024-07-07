package OOPSConcepts;

public class ClassX extends ClassB {
	
	int X = 100;
	int Y =200;
	
	public void Hello1() {
		System.out.println("Hello1");
	}
	
	public void Hello2() {
		System.out.println("Hello 2");
	}


	public static void main(String[] args) {
		
		//Object is for ClassX only
		ClassX  objX = new ClassX();
		
		
		//its own class members or properties [variables /methods]
		System.out.println(objX.X);
		System.out.println(objX.Y);
        objX.Hello1();
        objX.Hello2();
		
        
        //class B members [ Class X extends Class B]
        System.out.println(objX.C);
		System.out.println(objX.D);
		objX.div();
		objX.mul();
		
		
		//Class A members [ Already Class B extending ClassA]
		System.out.println(objX.A);
		System.out.println(objX.B);
		objX.add();
		objX.sub();
		
		
		
	}

}
