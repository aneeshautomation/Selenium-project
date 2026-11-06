package junitpackage;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeEach
	public void openweb()
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void linktotal()
	{
		List<WebElement> link = driver.findElements(By.tagName("a"));  //to locate <a> tags
		System.out.println("Link count : "+link.size());
		
		for(WebElement li:link)
		{
			//System.out.println("Link -------"+li.getAttribute("href"));  // to get the attributes of href tag
			System.out.println(li.getText()+"------"+li.getAttribute("href"));  // to get the text in a tag
		}
	}
	
	@AfterEach
	public void closebsr()
	{
		driver.quit();
	}
	
}
