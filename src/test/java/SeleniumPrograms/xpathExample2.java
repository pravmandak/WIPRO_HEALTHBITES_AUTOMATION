package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathExample2 {

	public static void main(String[] args) {
		
		
		WebDriver driver;
	    
	    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chomeV24/chromedriver");
	    
	    ChromeOptions options = new ChromeOptions();
	    
	    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
	    
	    driver = new ChromeDriver(options);
	 
	    driver.manage().window().maximize();
	    
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    
	    WebElement OneWay_RDB = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']"));
	    
	    OneWay_RDB.click();
	    
	    WebElement link = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
	    link.click();
	    
	    WebElement link1 = driver.findElement(By.partialLinkText("Free Access to InterviewQues/ResumeAssistance/Material"));
	    link1.click();
	    
	    
	    WebElement link2 = driver.findElement(By.xpath(""));
	    link1.click();
	    

	}

}
