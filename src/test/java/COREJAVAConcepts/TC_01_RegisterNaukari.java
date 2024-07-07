package COREJAVAConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_01_RegisterNaukari {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Chrome Browser in MAC system
		
        WebDriver driver;
	    
	    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chomeV24/chromedriver");
	    
	    ChromeOptions options = new ChromeOptions();
	    
	    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
	    
	    driver = new ChromeDriver(options);
	    
	    
	    //To maximize the browser window
	    driver.manage().window().maximize();
	    
	    //Enter the URL 
	    driver.get("https://www.naukri.com/");
	    
	    
	    //Elements Location 
	    
	    WebElement btn_Register = driver.findElement(By.xpath(" //a[@id='register_Layer']"));
	    WebElement txt_fullname = driver.findElement(By.xpath("//input[@id='name']"));
	    WebElement txt_email= driver.findElement(By.xpath("//input[@class='formInput mandatory __input' and @id='email']"));
	    WebElement txt_password = driver.findElement(By.xpath("//input[@id='password']"));
	    WebElement txt_mobile = driver.findElement(By.xpath("//input[@id='mobile']"));
	    WebElement lnk_Exp= driver.findElement(By.xpath("//div[@data-val='exp']"));
	    WebElement btn_RegNow= driver.findElement(By.xpath("//button[text()='Register now']"));
	    
	  
	    
	    if(btn_Register.isDisplayed()) {
	    	btn_Register.click();
	    }

	    Thread.sleep(2000);
	    
	    if(txt_fullname.isDisplayed()) {
	    	txt_fullname.sendKeys("praveen");
	    }
	    
	    
	    
	    
	}

}
