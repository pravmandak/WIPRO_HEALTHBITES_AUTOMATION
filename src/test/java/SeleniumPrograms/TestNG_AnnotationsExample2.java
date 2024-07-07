package SeleniumPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class TestNG_AnnotationsExample2 {
	

	@BeforeMethod   
	public void BM() {
		System.out.println("Launch the Chrome Browser ");
		System.out.println("This is Login to application ");
	}

	@Test(invocationCount=5)

	public void AC() {   // 1time
		System.out.println("This is verifyPLace order");
	}
	  
	@Test  (invocationCount=3)  // 3times executes
	public void AA() {   
		System.out.println("This is Login");
	}
	
	@Test  (invocationCount=2)

	public void AB() {     // 1 time
		System.out.println("This is Payments");
	}

	
	@AfterMethod    
	public void AM() {
		System.out.println("This is Logout from application");
		System.out.println("Close the browser");
	}
	
	
}
