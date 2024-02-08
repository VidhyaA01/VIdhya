package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Vidhya_selenium\\Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		W3login PQR = new W3login(driver);
				PQR.Login();
				PQR.Email();
				PQR.Password1();
				
	}

}
