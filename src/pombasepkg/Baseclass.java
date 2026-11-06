package pombasepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;
	 
	@BeforeTest 
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
}
