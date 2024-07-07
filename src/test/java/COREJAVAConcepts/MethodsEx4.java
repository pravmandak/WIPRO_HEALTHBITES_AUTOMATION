package COREJAVAConcepts;

public class MethodsEx4 {
	
	int X =3000;
	int Y = 5000;
	static int Z = 1000;
	
	public void addNumbers() {
		int A = 10;
		int B = 20;
		System.out.println(A + B);
	}
	
	
	//Method with Parameters // Pass values while RunTime
	public void subNumbers(int X, int Y) {
	
		System.out.println(X - Y);
		
	}
	
	public static void heighAndWeigth(double h, int w) {
		System.out.println(h);
		System.out.println(w);
	}
	
	

	public static void main(String[] args) {
		
		MethodsEx4 obj = new MethodsEx4();
		obj.addNumbers();
		System.out.println(MethodsEx4.Z);
		
		MethodsEx4.heighAndWeigth(10.22, 12);
		
	}

}
