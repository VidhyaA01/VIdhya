package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgettonpass {
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement Forgetpass;
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email;
	public Forgettonpass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void  Forgetpass()
	{
		Forgetpass.click();
	}
	public void Email()
	{
		Email.sendKeys("vidhya1234@gmail.com");
	}
}
