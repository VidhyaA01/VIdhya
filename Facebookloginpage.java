package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookloginpage {
	@FindBy(xpath="//input[@id='email']")
	private WebElement UN;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement PWD;
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	public Facebookloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Email()
	{
		UN.sendKeys("ABC");
	}
	public void Password()
	{
	PWD.sendKeys("12345678");
	}
	public void Login()
	{
		loginBtn.click();
	}
	

}
