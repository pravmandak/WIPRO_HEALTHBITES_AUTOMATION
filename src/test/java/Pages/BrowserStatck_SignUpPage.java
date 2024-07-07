package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStatck_SignUpPage {

	WebDriver driver;

	@FindBy(id = "user_full_name")
	WebElement txt_FullName;

	@FindBy(id = "user_email_login")
	WebElement txt_BusinessEMail;

	@FindBy(id = "user_password")
	WebElement txt_Password;

	public BrowserStatck_SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void updateSignupDetails() {

				txt_FullName.sendKeys("Praveen");
				txt_BusinessEMail.sendKeys("praveen@gmail.com");
				txt_Password.sendKeys("Hello@12234");
	

	}

}
