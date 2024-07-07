package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathExample {

	public static void main(String[] args) {
		
		WebDriver driver;
	    
	    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedriver-mac-arm64/chromedriver");
	    
	    ChromeOptions options = new ChromeOptions();
	    
	    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
	    
	    driver = new ChromeDriver(options);
	 
	    driver.manage().window().maximize();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    WebElement SelectCnt = driver.findElement(By.xpath("/html/body/div[1]/div[4]/fieldset/label[1]/input"));
	    
	    SelectCnt.sendKeys("India");

	    WebElement ChkBox1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/fieldset/label[1]/input"));
	    ChkBox1.click();
	    
	    
	    
	    

	}

}
