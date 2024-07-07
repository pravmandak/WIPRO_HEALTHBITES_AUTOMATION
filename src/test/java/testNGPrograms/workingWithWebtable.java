package testNGPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class workingWithWebtable {
	
	WebDriver driver;

	@BeforeMethod
	public void SetupChromeBrowserAndLaunchURL() {
		
	    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedriver-mac-arm64/chromedriver");
	    
	    ChromeOptions options = new ChromeOptions();
	    
	    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
	    
	    driver = new ChromeDriver(options);
	 
	    driver.manage().window().maximize();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
	    
	}
	
	@Test
	public void verifyAccessPlanLink() {
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Explicit Wait object Creation 
		WebDriverWait   wait  = new WebDriverWait(driver, 10);

		//Home Page
		WebElement columnData= driver.findElement(By.xpath("//legend[text()='Web Table Example']/following-sibling::table[@id='product']//tr[1]//td[1]"));

		System.out.println(columnData.getText());

		
		 // Add To cart 
		WebElement Quantity= driver.findElement(By.xpath("//legend[text()='Web Table Example']/following-sibling::table[@id='product']//tr[1]//td[1]"));

		
		wait.until(ExpectedConditions.visibilityOf(Quantity)); // 3 secs  [Remaining 7 secs] 
		
       
		System.out.println(columnData.getText());
		
		
		
        //Payment gateway
		WebElement lgoinButton= driver.findElement(By.xpath("//legend[text()='Web Table Example']/following-sibling::table[@id='product']//tr[1]//td[1]"));

		wait.until(ExpectedConditions.visibilityOf(lgoinButton));  // 10 secs
		
		System.out.println(columnData.getText());
		
		
		
		//Wait for frame load //Text
		//wait.until(ExpectedConditions.textToBePresentInElementValue(lgoinButton, "Login");
		
		//Alert to
		//wait.until(ExpectedConditions.alertIsPresent(lgoinButton);
		
	
	
	}
	

}
