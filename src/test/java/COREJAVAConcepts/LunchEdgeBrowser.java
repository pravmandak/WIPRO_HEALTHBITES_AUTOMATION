package COREJAVAConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver;
    
    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedriver-mac-arm64/chromedriver");
    
    ChromeOptions options = new ChromeOptions();
    
    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
    
    driver = new ChromeDriver(options);
 
    driver.manage().window().maximize();
    
    //To Launch any URL in the browser : get method is used to launch the URL in selenium. 
    
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");   

    WebElement  chk_Opt1 =  driver.findElement((By.id("checkBoxOption1")));
    
    System.out.println(chk_Opt1.isDisplayed());  // return output :  true / false 
    
    System.out.println(chk_Opt1.isSelected());   // true or false
    
    
    if(chk_Opt1.isSelected()) {
    	System.out.println("Check box is already checked and no action required");
    }
    else {
    	chk_Opt1.click();
    }
    
    
    
    
    

	}

}
