package generalLIbs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base  extends SlackIntegration{
	public static WebDriver driver;
	
	public static void initilization()
	{
	
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/geckodriver.exe");
	    driver.manage().window().maximize();			//maximize the browser window
	    driver.get("https://www.abhibus.com/");	 // Navigated to Abhibus Site
	}
	
	public void failed(String testMethodName)
	{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(srcFile, new File("/Moudle1/ScreenShotsFailures/" + testMethodName));
		}
		catch (IOException e)
		{
		e.printStackTrace();
	}
	}
}
