package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenshot {

	public static String capture(WebDriver driver, String screenShotName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE); // It will take screenshot from Web Application
		String dest = "/Users/mpk/eclipse-workspace/AutomationPractice/screenshots" + "FailedScreens.png"; // Path
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);

		return dest;

	}

}
