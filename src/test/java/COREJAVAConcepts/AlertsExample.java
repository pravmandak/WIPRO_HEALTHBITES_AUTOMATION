package COREJAVAConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver;
		    
		    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chomeV24/chromedriver");
		    
		    ChromeOptions options = new ChromeOptions();
		    
		    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
		    
		    driver = new ChromeDriver(options);
		 
		    driver.manage().window().maximize();
		    
		    driver.get("https://demoqa.com/alerts");  //A New Page is going to load in browser
		    
		    driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		    
		    
		    WebElement ClickMebtn = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		    
		    ClickMebtn.click();
		    
		    Thread.sleep(3000);
 
		    
		    try {
		    	
		    Alert ALt = driver.switchTo().alert();
	
		     // ALt.accept();
		    //ALt.dismiss();
		    
		    //How to print text on alert window
		    System.out.println(ALt.getText());
		    
		    } catch(NoAlertPresentException ex) {
		    	System.out.println("Alert is not found so moving to next steps");
		    }
		    

	}

}
