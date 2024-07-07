package testNGPrograms;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tesngParametersExample {
	
	WebDriver driver;

	@BeforeMethod
	public void SetupChromeBrowserAndLaunchURL() {
		
	    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedriver-mac-arm64/chromedriver");
	    
	    ChromeOptions options = new ChromeOptions();
	    
	    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
	    
	    driver = new ChromeDriver(options);
	 
	    driver.manage().window().maximize();
	    
	    driver.get("https://demoqa.com/droppable/");
	    
	}

	@Test
	
	public void verifyLogin() throws InterruptedException {
		
	
     // WebElement mouseButton = driver.findElement(By.id("mousehover"));
     
      Actions  act = new Actions(driver);
      
     //act.moveToElement(mouseButton).build().perform();   //Hower the mouse
      
     //act.doubleClick();  //DOuble Click
      
    // act.contextClick();  //Right Click
      
      
      WebElement Src = driver.findElement(By.id("draggable"));
      WebElement Dest = driver.findElement(By.id("droppable"));
      
      
          Action dragAndDrop = act.clickAndHold(Src).moveToElement(Dest).release(Src).build();
          
          dragAndDrop.perform();
          
          act.sendKeys(Dest, "Praveen");

	 
	}
	
	/*@AfterMethod
	public void closeBrowser() {
		driver.close();
	}*/
	


}
