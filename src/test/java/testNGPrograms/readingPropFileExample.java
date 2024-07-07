package testNGPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readingPropFileExample {

	public static void main(String[] args) throws IOException {
		
		Properties propfile = new Properties();
		
		FileInputStream  ConfigFile =  new  FileInputStream("/Users/mpk/eclipse-workspace/AutomationPractice/src/test/java/Utilities/TestData.properties");
		
		
		propfile.load(ConfigFile);
		
		
		String URL =  propfile.getProperty("QAURL");
		String UN =  propfile.getProperty("userName");
		String PWD =  propfile.getProperty("password");
		
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
		
		
		

	}

}
