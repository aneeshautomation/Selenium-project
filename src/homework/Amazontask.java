package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontask {

	
	
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeEach
	public void openbsr()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void cart() throws Exception
	{
		WebElement electr = driver.findElement(By.xpath("//a[contains(@data-csa-c-slot-id,\"nav_cs_7\")]"));
		electr.click();
		
		Thread.sleep(3000);
		WebElement cartbtn = driver.findElement(By.xpath("//div[contains(@id,'nav-cart-text-container')]"));
		cartbtn.click();
	}
	
}
