package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3login {
	@FindBy(xpath="//a[@title='Login to your account']")
	private WebElement Login;
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email;
	@FindBy(xpath="//input[@name='current-password']")
	private WebElement Password1;
	public W3login (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Login()
	{
		Login.click();
	}
	public void Email()
	{
		Email.sendKeys("vidhya1234@gmail.com");
	}
	public void Password1()
	{
		Password1.sendKeys("1234546789");
	}
}
