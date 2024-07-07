package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MOuseKeyboardOperations {
	
	WebDriver driver;

	@BeforeMethod
	public void SetupChromeBrowserAndLaunchURL() {
		
	    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedriver-mac-arm64/chromedriver");
	    
	    ChromeOptions options = new ChromeOptions();
	    
	    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
	    
	    driver = new ChromeDriver(options);
	 
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    
	}

	@Test
	@Parameters({"userName","password"})
	public void verifyLogin(String UN, String PWD) {
		
		WebElement txt_UserName = driver.findElement(By.id("email"));
		WebElement txt_Password = driver.findElement(By.id("pass"));
		WebElement btn_login = driver.findElement(By.id("pass"));
		
		txt_UserName.sendKeys(UN);
		txt_Password.sendKeys(PWD);  // Hard coding .... we have to use parameterization techniques...
		btn_login.click();
	
	}
	
	@AfterMethod
	public void closeBrowser() {
		//driver.close();
	}
	
	
	
	
	
	

}
