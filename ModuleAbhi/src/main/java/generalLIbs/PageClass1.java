package generalLIbs;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass1 {
	
	WebDriver driver;
	Actions a = new Actions(driver);
	
	  public PageClass1(WebDriver driver) {
		 this.driver= driver;
	        PageFactory.initElements(driver, this);
	  }
	/*public PageClass1( WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}*/
	
	@FindBy(xpath="//input[@id='source']")
	public WebElement fromLoc;
	
	public void fromLocation(String Leavingfrom)
	{
		fromLoc.sendKeys(Leavingfrom);
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
	}
	
	@FindBy(xpath="//input[@id='destination']")
	public WebElement toLoc;
	
	public void toLocation(String destination)
	{
		fromLoc.sendKeys(destination);
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
	}
	
	@FindBy(xpath="//input[@id='datepicker1']")
	public WebElement datePicker;
	
	public void dateSelect()
	{
		//clicked on the date picker
		datePicker.click();
		//Selected the Required date from the calender
		CommonMeth meth = new CommonMeth(driver);
		meth.dateselected();
	}
	
	@FindBy(xpath="//*[contains(text(),'Search')]/preceding-sibling::div/div/form/div/div[5]/a")
	public WebElement clickSearchButton;
	public void clickSearch()
	{
		//clicked on the date picker
		clickSearchButton.click();
	}
	
	
	

}
