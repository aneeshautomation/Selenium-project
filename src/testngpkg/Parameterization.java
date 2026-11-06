package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization {

	ChromeDriver driver;
	
	@BeforeClass
	void browser()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	
	@Parameters({"un","pd"})
	
	@Test
	void login(String un, String pd)
	{
		WebElement username = driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		username.sendKeys(un);
		
		WebElement pswd = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		pswd.sendKeys(pd); 
	}
	
}
