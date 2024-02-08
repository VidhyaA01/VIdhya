package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newaccountfb {
	@FindBy(xpath="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	private WebElement NewAcoount;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement Fname;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement Lname;
	public Newaccountfb (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void newaccount()
	{
		NewAcoount.click();
	}
	public void firstname()
	{
		Fname.sendKeys("Vidhya");
	}
	public void lastname()
	{
		Lname.sendKeys("Agre");
	}
}
