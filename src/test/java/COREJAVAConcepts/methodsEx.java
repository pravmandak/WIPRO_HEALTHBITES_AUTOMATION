package COREJAVAConcepts;

public class methodsEx {
	
	
	public int hotelbill() {    //This add method is returning the output as 30.. and int data type.
		
		int A = 500;
		int B = 100;
		int C = A + B;
		return C;     //600	
	}
	

	
	

	public static void main(String[] args) {
		
		methodsEx  obj = new methodsEx();
		
		int FinalOutput =  obj.hotelbill()  *  18/100;
		
		System.out.println(FinalOutput);
		
	}

}
