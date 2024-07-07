package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class VerifyFB_LoginFunctionality {
	
	
	@Test
	public void FB_Login() {
	
	WebDriver driver;
	
    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedriver-mac-arm64/chromedriver");
    
    ChromeOptions options = new ChromeOptions();
    
    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
    
    driver = new ChromeDriver(options);
 
    driver.manage().window().maximize();
    
    driver.get("https://www.facebook.com/login/");
   
    WebElement emailTxt = driver.findElement(By.id("email"));
    WebElement  passwordTxt=driver.findElement(By.id("pass"));
    WebElement loginBtn = driver.findElement(By.id("loginbutton"));
    
   // emailTxt.sendKeys("pranay");  //Hardcoding Not suggested
   // passwordTxt.sendKeys("test@123"); //Hardcoding
    
    
    loginBtn.click();
    
    
    
	}
		
	
	
	
	
	
	

}
