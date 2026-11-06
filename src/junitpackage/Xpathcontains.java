package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcontains {

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeEach
	public void openweb()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void locating() throws Exception
	{
		WebElement rediffmail = driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		rediffmail.sendKeys("Hello@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement fullname = driver.findElement(By.xpath("//input[contains(@name,'name') and @placeholder=\"Enter your full name\"]"));
		fullname.sendKeys("Aneesh S");
		
	}
	
	@AfterEach
	public void closebsr()
	{
		driver.quit();
	}
}
