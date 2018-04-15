package sampleGITTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sampleGitTest {
@Test
public void logintest() throws IOException{
	WebDriver wd = new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://www.google.co.in/");
	
	File src = ((TakesScreenshot) wd ).getScreenshotAs(OutputType.FILE);
	//file object converts to physical file
	FileUtils.copyFile(src, new File("C:\\Users\\Dilip\\workspace1\\SampleGITTest\\Screenshot\\test.jpg") );
	
}
}
