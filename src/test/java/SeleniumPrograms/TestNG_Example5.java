package SeleniumPrograms;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Example5 {
	
	
@BeforeMethod
public void login() {
	System.out.println("User logged in to application");
}

@Test (enabled=false)
public void TC_01() {
	System.out.println("TC_01 Executed");
}

@Test
public void TC_02() {
	System.out.println("TC_02 Executed");
	AssertJUnit.assertTrue(false);
}


@Test  (enabled=false)
public void TC_03() {
	System.out.println("TC_03 Executed");
}


@AfterMethod
public void UserLogout() {
	System.out.println("USer Logged out");
}




}
