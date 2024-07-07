package OOPSConcepts;

public class AutomationEx2  implements Cars {
	
	
	
	public void model() {
		
		System.out.println("This is Hyndai model");
	}

	public void speed() {
		
		System.out.println("120 km/hr");
	}
	
	

	public static void main(String[] args) {
		
		AutomationEx2  obj = new AutomationEx2();
		
		obj.model();
		obj.speed();
		
		

	}


}
