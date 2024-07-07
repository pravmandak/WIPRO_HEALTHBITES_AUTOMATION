package SeleniumPrograms;

public class automationEx {

	public static void main(String[] args) {
		
		automationEx obj1 = new automationEx();   // memory allocate....
		automationEx obj2 = new automationEx(); 
		automationEx obj3 = new automationEx(); 
		
		obj1 = null; // to free up the memory space when ever the object is no longer needed.
		
	    System.gc();   // this gc method will destroy or move that object to Garbage

	}

}
