package testNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class verifySignup {
	
	
@Test
public void signupTC_01() {
	
WebDriver driver;
	
    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedriver-mac-arm64/chromedriver");
    
    ChromeOptions options = new ChromeOptions();
    
    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
    
    driver = new ChromeDriver(options);
 
    driver.manage().window().maximize();
    
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
    
	
}

}
