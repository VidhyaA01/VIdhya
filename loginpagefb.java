package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpagefb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Vidhya_selenium\\Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*Facebookloginpage ABC = new Facebookloginpage(driver);
		 ABC.Email();
		 ABC.Password();
		 ABC.Login();*/
		
		/*Newaccountfb Vidhya = new Newaccountfb(driver);
		Vidhya.newaccount();
		Thread.sleep(2000);
		Vidhya.firstname();
		Vidhya.lastname();*/
		
		Forgettonpass XYZ = new Forgettonpass(driver);
		XYZ.Forgetpass();
		XYZ.Email();

	}

}
