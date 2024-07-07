package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class BrowserStack_DemoPage {

	WebDriver driver;

	@FindBy(id="popUpCsfModalTitle")
	WebElement pageHeaderDemo;  //private variable
	
	@FindBy(xpath="//div[@id='tingle-modal-box']//input[@id='pcsf_form_fname_1']")
	WebElement txt_Fullname;
	
	@FindBy(xpath="//div[@id='tingle-modal-box']//input[@id='pcsf_form_email_1']")
	WebElement txt_Email;
	
	@FindBy(xpath="//div[@id='tingle-modal-box']//input[@id='pcsf_form_company_1']")
	WebElement txt_Company;
	
	@FindBy(xpath="//div[@id='tingle-modal-box']//input[@id='pop_csf_option_2']")
	WebElement chk_Technology;
	
	@FindBy(xpath="//div[@id='tingle-modal-box']//input[@value='Get a demo']")
	WebElement btn_GetDemo;
	
	
	
	public BrowserStack_DemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	public void verifyDemoPageHeader() {
		String pagHeader= pageHeaderDemo.getText();
		if(pagHeader.equals("Schedule a personalized demo.")) {
			System.out.println("Yes Demo page displayed successfully");
		}
	}
	
	public void fillupDemoDetails() {
		txt_Fullname.sendKeys("Praveen");
		txt_Email.sendKeys("praveen@wipro.com");
		txt_Company.sendKeys("Wipro");
		chk_Technology.click();
		btn_GetDemo.click();
	}
	


}
