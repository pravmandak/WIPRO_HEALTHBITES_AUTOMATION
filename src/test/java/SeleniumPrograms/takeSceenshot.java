package SeleniumPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class takeSceenshot {

	@Test
	public void verifyWindows() throws InterruptedException, IOException {

		WebDriver driver;
		
		TakesScreenshot screenshot;

		System.setProperty("webdriver.chrome.driver", "/Users/mpk/Downloads/chromedriver-mac-arm64/chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("/Users/mpk/Desktop/Google Chrome.app/Contents/MacOS/Google Chrome");

		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);

		String expTitle = driver.getTitle();

		if (expTitle.equalsIgnoreCase("Practice Page")) {

			screenshot = null; // if any old reference they will be become empty

			screenshot = (TakesScreenshot) driver; // Casting...

			File loc = screenshot.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(loc, new File("/Users/mpk/Desktop/Bacth30_Docs/scrrenshot.png"));
			
		} else

		{
			System.out.println("Not able to land on home page");
		}
	}

}
