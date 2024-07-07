package COREJAVAConcepts;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;

public class xpathExample1 {

	public static void main(String[] args) {
		
        WebDriver driver;
	    
	    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chomeV24/chromedriver");
	    
	    ChromeOptions options = new ChromeOptions();
	    
	    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
	    
	    driver = new ChromeDriver(options);
	 
	    driver.manage().window().maximize();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    String PgTitle = driver.getTitle();
	    
	    WebElement checbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	    WebElement checbox2 = driver.findElement(By.xpath("//input[@value='option2']"));
	    WebElement checbox3 = driver.findElement(By.xpath("//input[@name='checkBoxOption3']"));
	    
	    if(checbox1.isDisplayed())	{
	    	checbox1.click();
	  
	    }
	    else
	    {
	    	System.out.println("Checkbox 1 is not exist");
	    }
	    
	    
       if(checbox2.isDisplayed())	{
	    	
    	   checbox2.click();
	  
	    }
	    else
	    {
	    	System.out.println("Checkbox 2 is not exist");
	    }
	    
       if(checbox3.isDisplayed())	{
	    	
    	   checbox3.click();
	  
	    }
	    else
	    {
	    	System.out.println("Checkbox 3 is not exist");
	    }
	    
	    
	    		

	}

}
