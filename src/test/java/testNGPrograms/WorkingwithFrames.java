package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WorkingwithFrames {
	
	WebDriver driver;

	@BeforeMethod
	public void SetupChromeBrowserAndLaunchURL() {
		
	    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedriver-mac-arm64/chromedriver");
	    
	    ChromeOptions options = new ChromeOptions();
	    
	    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
	    
	    driver = new ChromeDriver(options);
	 
	    driver.manage().window().maximize();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	}

	@Test
	public void verifyAccessPlanLink() {
		
		try {
		driver.switchTo().frame("courses-iframe");
		
		//driver.switchTo().frame(0);
		
		WebElement lnk_AccessPlan = driver.findElement(By.xpath("(//nav[@class='main-menu']//a[text()='All Access plan'])[1]"));
		lnk_AccessPlan.click();
		
		WebElement img_accessSub = driver.findElement(By.xpath("//h1[text()='All Access Subscription']"));
		
		if (img_accessSub.isDisplayed()) {
			System.out.println("All access subscription link clicked successfully");
		}
		else
		{
			System.out.println("Failed to click link");
		}
		
		}catch (NoSuchFrameException  ex) {
			System.out.println("Frame is not available so moving to next steps");
		}
		//Coming back to home or out of the frame 
		driver.switchTo().defaultContent();
		
		WebElement Chk_Opt1= driver.findElement(By.id("checkBoxOption1"));
		Chk_Opt1.click();
	
	}
	


}
