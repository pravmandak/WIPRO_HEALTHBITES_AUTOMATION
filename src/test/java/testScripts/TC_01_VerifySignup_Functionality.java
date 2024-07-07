package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BrowserStack_HomePage;
import Pages.BrowserStatck_SignUpPage;

public class TC_01_VerifySignup_Functionality {

	WebDriver driver;
	BrowserStack_HomePage   objHomepage;
	BrowserStatck_SignUpPage  objSignupPage;
	
	

	@BeforeTest
	public void browserSetup() {
		System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedriver-mac-arm64/chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");

		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://www.browserstack.com/");

		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void TC_01_verifyPageTitle() {
		objHomepage = new BrowserStack_HomePage(driver);
		objHomepage.verifyHomepageTitle();
		
	}
	
	@Test 
	public void TC_02_verifySIgnup() {
		objSignupPage = new BrowserStatck_SignUpPage(driver);
		
		objHomepage.clickGetStartedButton();
		objSignupPage.updateSignupDetails();
		
	}
	
	
	

}
