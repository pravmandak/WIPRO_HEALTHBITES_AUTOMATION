package SeleniumPrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandllingBrowserWindows {

	@Test
	public void verifyWindows() throws InterruptedException {
	
	WebDriver driver;
	
    System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedriver-mac-arm64/chromedriver");
    
    ChromeOptions options = new ChromeOptions();
    
    options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");
    
    driver = new ChromeDriver(options);
 
    driver.manage().window().maximize();
    
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
    driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
   
    WebElement btn_OpenWindow = driver.findElement(By.id("opentab"));
    
    btn_OpenWindow.click();
    
    driver.get("https://www.google.com");
    
    
    driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
    
    //New Browser Window / Tab opened so before doing any action we have switch from current tab to new tab
    
    String  ParentWindow =  driver.getWindowHandle();    //Parent Window ID  1  :3422j5hj5h4jhjh
    
    Set<String>  childWindows = driver.getWindowHandles();  // For Child Window ID   1/2/3/4
    
    Iterator<String>   itr =  childWindows.iterator();     //1
    
    
    while(itr.hasNext()) {
    	String childWindow =  itr.next();  //1 Child WInodw ID
    	
    	if(ParentWindow.equalsIgnoreCase(childWindow)) {
    		System.out.println("Dont witch");
    	} else {
    		driver.switchTo().window(childWindow);
    		System.out.println("Child window is different and we  switched to new window");
    		
    		 WebElement  lnk_AccessCourses = driver.findElement(By.linkText("Access all our Courses"));
    	     
    		    lnk_AccessCourses.click();
    		    
    		    Thread.sleep(3000);
    		    
    		    String expPageTitle = driver.getTitle();
    		    
    		    System.out.println(expPageTitle);
    		
    		 if(expPageTitle == "QA Click Academy | Corporate Trainings from Professionals | Udemy" ) {
    			 System.out.println("Clicked on Access courses link successfully");
    		 }
    
    	}
    	
    	//driver.switchTo().defaultContent();
    	
    	driver.switchTo().window(ParentWindow);
    	
    	Thread.sleep(3000);
    	
    	WebElement chk_Opt3 = driver.findElement(By.id("checkBoxOption3"));
    	chk_Opt3.click();
    	Thread.sleep(3000);
 
    	}
    }
    
    
    

		
	
	
	
	
	
	

}
