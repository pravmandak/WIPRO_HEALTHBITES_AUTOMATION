package COREJAVAConcepts;

public class MethodsEx5 {
	
	
	  int MM = 100;
	  int NN = 200;

	  
	  public void XYZ() {
		  
		 System.out.println("Hello");
	  }
	  
	public static void main(String[] args) {
		
		MethodsEx4  obj = new MethodsEx4();
		
		obj.addNumbers();
		obj.subNumbers(300, 200);
		
		System.out.println(obj.X);
		System.out.println(obj.Y);
		System.out.println(MethodsEx4.Z);
		
		MethodsEx4.heighAndWeigth(33.22, 12);
		
		MethodsEx5  obj2 = new MethodsEx5();
		
		System.out.println(obj2.MM);
		System.out.println(obj2.NN);

	}

}
