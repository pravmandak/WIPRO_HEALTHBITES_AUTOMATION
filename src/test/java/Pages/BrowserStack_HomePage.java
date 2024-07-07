package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class BrowserStack_HomePage {

	WebDriver driver;

	@FindBy(xpath = "(//img[@alt='BrowserStack Logo'])[1]")
	WebElement HomePageLogo;

	@FindBy(id = "signupModalProductButton")
	WebElement btn_GetStartedFree;

	@FindBy(xpath="//h1[text()='App & Browser Testing Made Easy']")
	WebElement header;
	
	@FindBy(xpath="//a[text()='Get started free']/parent::span//following-sibling::span[@data-btn-eventname='InteractedWithHomePage']/button[text()='Get a demo']")
	WebElement btn_getDemo;
	
	public BrowserStack_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void verifyHomepageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals("Most Reliable App & Cross Browser Testing Platform | BrowserStack", pageTitle);
		                       
	}
	

	public void clickGetStartedButton()  {
		btn_GetStartedFree.click();
		
	}
	
	public void verifyPageHeader() {
		String headerText = header.getText();
		if(headerText.equals("App & Browser Testing Made Easy")) {
			System.out.println("Page Header is valid as expected");
		}
	}
	
	public void clickDemoButton() {
		btn_getDemo.click();
	}
	

}
