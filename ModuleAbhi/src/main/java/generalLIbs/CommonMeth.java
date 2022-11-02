package generalLIbs;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMeth {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,30);
	
	public CommonMeth( WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void dateselected()
	{
	try {
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='ui-datepicker-div']/div[1]//a[text()='27' and not(contains(@class,'disabled'))]"))).click();
	    System.out.println("Selected date");
	}catch (TimeoutException e){
	    System.out.println("Invalid date");
	}
	}
}
