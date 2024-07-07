package COREJAVAConcepts;

public class VariablesEx {   //Class Name STARTS Here
	
	   // Instance Variables: With in the class and out side  method
	   int X =40;
	   int Y =50;
	   
	   //Static Variables or Class Variables
	   static int Age =33;
	   static int Num = 10;


	public static void main(String[] args) {  //Main Method 

		int A =10;  //Local 
		System.out.println(A);
		
		//How to create Object
		VariablesEx  Obj = new VariablesEx();
		
		System.out.println(Obj.X);
		System.out.println(Obj.Y);

		System.out.println(VariablesEx.Age);
		System.out.println(VariablesEx.Num);
		

	}

	
}             //Class Ends Here 
