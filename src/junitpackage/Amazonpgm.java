package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {

	ChromeDriver driver= new ChromeDriver();;
	@BeforeEach
	public void amazonopen()
	{
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void searchtst() throws Exception
	{
		Thread.sleep(2000);
		WebElement textbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//textbox.sendKeys("Mobiles");
		
		textbox.sendKeys("Mobiles",Keys.ENTER);  //To press the enter key after typing mobiles
		
	}
}
