package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generalLIbs.Base;
import generalLIbs.ListnerClassAbhiBus;
import generalLIbs.PageClass1;
import generalLIbs.PageClass2;

@Listeners(ListnerClassAbhiBus.class)
public class Airtest1 extends Base {

	public WebDriver driver;
	PageClass1 pg ;
	PageClass2 pc ;

	@BeforeMethod
	public void preStepExe() {
		//System.out.println("test message");
		initilization();
	}

	@Test
	public void Test1() {
		pg = new PageClass1(driver);
		pg.fromLocation("Banglore"); // entered leaving location
		pg.toLocation("Hyderabad"); // entered destination location
		pg.dateSelect(); // Clicked date picker and Selected the Required date i:e 27 dec 2022
		pg.clickSearch(); // clicked on Search button
		
		pc = new PageClass2(driver);
		pc.NavigatedtoServicePage(); // Verifying the Page is navigated to Service page
		pc.VerifytextofTravels(); // Verifying the text here for required travels
	}

	@AfterMethod
	public void tearDown() {
		driver.close(); // closing the browser
	}

}
