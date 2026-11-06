package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	WebDriver driver;
	
	@Parameters("browser")
	
	@BeforeTest
	void browser(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			System.out.println("Chrome browser");
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			System.out.println("Edge browser");
		}
		
		else
		{
			driver = new FirefoxDriver();
			System.out.println("Firefox browser");
		}
		
	}
	
	@Test
	void method1() throws Exception
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
}
