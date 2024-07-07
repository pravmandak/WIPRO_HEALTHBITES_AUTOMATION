package SeleniumPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Example4 {
	

	@BeforeMethod   
	public void BM() {
		System.out.println("Launch the Chrome Browser ");
		System.out.println("This is Login to application ");
	}

	@Test(dependsOnMethods= "Login")

	public void ProductsAddToCart() {   
		System.out.println("This is search and add to cart");
	}
	
	@Test  (groups="Prelogin Function") 
	public void Login() {   
		System.out.println("This is Login");
	}
	@Test  (groups= "Post Login Functin")

	public void ReciptOrderPayments() {   
		System.out.println("This is Payments");
	}
	@Test  (groups="Prelogin Function")

	public void LaunchURLBrowser() {   
		System.out.println("This is Launching browser");
	}
	
	@Test (groups="Prelogin Function")
	public void DeleteCookies() {   
		System.out.println("This is Deleting Cookies");
	}
	
	@Test  (groups="Post Function")

	public void AddNewAddress() {   
		System.out.println("This is Add New Address");
	}

	
	@AfterMethod    
	public void AM() {
		System.out.println("This is Logout from application");
		System.out.println("Close the browser");
	}
	

}
