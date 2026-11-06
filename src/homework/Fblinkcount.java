package homework;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblinkcount {

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeEach
	public void open()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void counting()
	{
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Linkcount : "+link.size());
		
		for(WebElement li : link)
		{
			System.out.println(li.getText()+"-------"+li.getAttribute("href"));
		}
	}
	
	@AfterEach
	public void quitbsr()
	{
		driver.quit();
	}
}
