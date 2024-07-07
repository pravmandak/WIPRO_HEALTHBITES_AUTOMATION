package SeleniumPrograms;

import org.testng.annotations.*;

public class TestNG_GroupsEx {
	
	@BeforeMethod 
	public void BM() {
	System.out.println("Launch the Chrome Browser ");
	System.out.println("This is Login to application ");
	}
	@Test(groups= "Insurance")
	public void ProductsAddToCart() { 
	System.out.println("This is search and add to cart");
	}
	@Test (groups="Insurance") 
	public void Login() { 
	System.out.println("This is Login");
	}
	@Test (groups= "Claims Payments")
	public void ReciptOrderPayments() { 
	System.out.println("This is Payments");
	}
	@Test (groups="Claims Payments")
	public void LaunchURLBrowser() { 
	System.out.println("This is Launching browser");
	}
	@Test (groups="Claims Payments")
	public void DeleteCookies() { 
	System.out.println("This is Deleting Cookies");
	}
	@Test (groups="Insurance")
	public void AddNewAddress() { 
	System.out.println("This is Add New Address");
	}
	@AfterMethod 
	public void AM() {
	System.out.println("This is Logout from application");
	System.out.println("Close the browser");
	}


}
