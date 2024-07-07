package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
	    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedriver-mac-arm64/chromedriver");
	    
	    ChromeOptions options = new ChromeOptions();
	    
	    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
	    
	    driver = new ChromeDriver(options);
	 
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(3000);

	    WebElement TopElement = driver.findElement(By.linkText("Forgotten password?"));
	    
	    try {
         WebElement lastElement = driver.findElement(By.xpath("//span[text()=' Meta © 2']"));
         
         JavascriptExecutor js = (JavascriptExecutor)driver;
        
        js.executeScript("arguments[0].scrollIntoView(true);", lastElement);
        
	    }
	    
	    catch(NoSuchElementException  ex) {
	    	System.out.println("Element is not visible ");
	    }
        
	   catch (NoSuchFrameException  ex) {
		System.out.println("Frame is not available so moving to next steps");
	    }
	    
	   catch (NoAlertPresentException  ex) {
		System.out.println("Alert is not available so moving to next steps");
	   }
	    
	    
	   finally {
        Thread.sleep(3000);
        
       System.out.println("I am Signing out");

	   }
		
	}

}
