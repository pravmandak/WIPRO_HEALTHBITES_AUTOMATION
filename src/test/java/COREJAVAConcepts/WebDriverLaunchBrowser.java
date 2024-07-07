package COREJAVAConcepts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverLaunchBrowser {

	public static void main(String[] args) {
		
	ChromeOptions chromeOptions = new ChromeOptions();
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver(chromeOptions);
	
	driver.get("https://www.Google.com");

	}

}
