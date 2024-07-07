package testScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.BrowserStack_DemoPage;
import Pages.BrowserStack_HomePage;
import Pages.BrowserStatck_SignUpPage;
import Utilities.GetScreenshot;

public class TC_02_VerifyDemoFunctionality {

	WebDriver driver;
	
	BrowserStack_HomePage   objHomepage;
	BrowserStatck_SignUpPage  objSignupPage;
	BrowserStack_DemoPage   objDemoPage;
	static ExtentTest test;
	static ExtentReports report;


	@BeforeClass
	public void startTest() {
		report = new ExtentReports("/Users/mpk/eclipse-workspace/AutomationPractice/Reports"+"SPrint1.html");
		test = report.startTest("TC_02_VerifyDemoFunctionality");
	}


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
	
	
	@Test()
	public void TC_01_verifyPageTitle() throws IOException {
		objHomepage = new BrowserStack_HomePage(driver);
		String title = driver.getTitle();
		String  screenshotPath = GetScreenshot.capture(driver, "Verify the title of Home page");
		
		if(title.equals("Most Reliable App & Cross Browser Testing Platform | BrowserStack")) {
			test.log(LogStatus.PASS, test.addScreenCapture(screenshotPath));
		}  else {
			test.log(LogStatus.FAIL, "Not able to verify Home Page title or invalid title");
			
		}
	}
	
	@Test (enabled=false)
	public void TC_02_verifySIgnup() throws IOException {
		objSignupPage = new BrowserStatck_SignUpPage(driver);
		objHomepage.clickGetStartedButton();
		String title = driver.getTitle();
		String  screenshotPath = GetScreenshot.capture(driver, "Verify the  signup page");

		if (title.equals("Get Started For Free &amp; Access 3000+ Mobile Devices facebook Browsers | BrowserStack")) {
			test.log(LogStatus.PASS, test.addScreenCapture(screenshotPath));
		} else {
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
		}
		objSignupPage.updateSignupDetails();
		
	}
	
	
	@Test (enabled=false)
	public void TC_03_verifyPageHeader() {
		objHomepage = new BrowserStack_HomePage(driver);
		objHomepage.verifyPageHeader();
	}
	
	@Test (enabled=false)
	public void TC_04_verifyDemoButtonClickedandDemoPageOpened() throws InterruptedException {
		objHomepage = new BrowserStack_HomePage(driver);
		objHomepage.clickDemoButton();
		Thread.sleep(5000);
		
	}
	
	@Test (enabled=false)
	public void TC_05_VerifyDemoFormFilling() {
		 objDemoPage = new BrowserStack_DemoPage(driver);
		 objDemoPage.verifyDemoPageHeader();
		 objDemoPage.fillupDemoDetails();
	}
	
	
	@AfterClass
	public void endTest() {
		report.endTest(test);
		report.flush();

	}

}
