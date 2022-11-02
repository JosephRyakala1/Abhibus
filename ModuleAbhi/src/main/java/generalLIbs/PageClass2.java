package generalLIbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageClass2 {
	WebDriver driver;
	
	
	public PageClass2( WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='seviceList']")
	public WebElement ServiceList;
	
	public void NavigatedtoServicePage()
	{
		//clicked on the date picker
		ServiceList.isDisplayed();
		
	}
	
	@FindBy(xpath="(//div[@id='SerVicesDetOnewayInner']/div/div)[2]/div/h2")
	public WebElement VerifyText;
	
	public void VerifytextofTravels()
	{
		//clicked on the date picker
		String Expectedtext = VerifyText.getText();
		String Actualtext= "SRS Travels and Logistics Private Limited";
		Assert.assertEquals(Actualtext, Expectedtext);
		
	}
	
	
	
}
