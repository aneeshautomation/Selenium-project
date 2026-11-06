package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralapropertylogin {

	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();  //to maximize the window
	}
	
//	@Test
//	public void titleverification()
//	{
//		String actualtitle = driver.getTitle();
//		System.out.println("Title of the webpage : "+actualtitle);
//	}
//	
//	@Test
//	public void textverification()
//	{
//		String sourcecode = driver.getPageSource();  //to retrieve the source code
//		if(sourcecode.contains("User Login"))
//		{
//			System.out.println("Text is present");
//		}
//		else
//			System.out.println("Text is not present");
//	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.id("ulogin"));  //locating username with locator id
		username.sendKeys("aneesh1369000@gmail.com"); //typing value in the username field //accepts only string values
		
		WebElement password = driver.findElement(By.name("upass"));
		password.sendKeys("password1234");
		
		WebElement loginbtn = driver.findElement(By.id("sub_logbtn"));
		loginbtn.click();
	}
	
//	@AfterEach
//	public void close()
//	{
//		driver.quit();
//	}
	
}
