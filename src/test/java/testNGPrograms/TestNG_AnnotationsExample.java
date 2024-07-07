package testNGPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class TestNG_AnnotationsExample {
	

	@BeforeSuite     //Step 1
	public void BS() {
		System.out.println("This is before SUite method");
	}
	
	@BeforeTest    // Step 2
	public void BT(){
		System.out.println("This is Before Test ");
	}
	
	
	@BeforeClass   //Step 3
	public void BC() {
		System.out.println("This is Before Class ");
	}
	//above also executes only one time
	
	
	@BeforeMethod   //Step 4  Step 7  step 10
	public void BM() {
		System.out.println("This is Before Method ");
	}

	@Test   //This is your actual test case functionality
	public void TC_01() {  //Step 5 
		System.out.println("This is  TC_01");
	}
	  
	@Test
	public void TC_02() {   //Step 8
		System.out.println("This is TC_02");
	}
	
	@Test
	public void TC_03() {     //Step 11
		System.out.println("This is TC_03");
	}
	
	@Test
	public void TC_04() {     //Step 11
		System.out.println("This is TC_04");
	}
	
	
	@AfterMethod    //Step 6    Step 9 Step 13
	public void AM() {
		System.out.println("This is After Method");
	}
	
	
	//only one time 
	@AfterClass    //Step 14
	public void AC() {
		System.out.println("This is AFter Class");
	}
	
	@AfterTest   //Step 15
	public void AfterTest() {
		System.out.println("This is After Test");
	}
	
	@AfterSuite   //Step 16
	public void AS() {
		System.out.println("This is After SUite");
	}
	
	
}
