package testngpkg;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindowDemoSite {
	
		WebDriver driver;
		
		@BeforeTest
		public void setup()
		{
			driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Windows.html");
			driver.manage().window().maximize();
		}
		
		@Test
		public void handling()
		{
			String parentwindow = driver.getWindowHandle();
			System.out.println("Title of parent window : "+driver.getTitle());
			
			WebElement clickbtn = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
			clickbtn.click();
			
			List<String> alltabs = new ArrayList<>(driver.getWindowHandles());
			
			driver.switchTo().window(alltabs.get(1));
			
			System.out.println("Current window : "+driver.getTitle());
			
			driver.close();  //close current tab
			
			driver.switchTo().window(alltabs.get(0));
			System.out.println(driver.getCurrentUrl());
			
		}
		
}
