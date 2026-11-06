package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitpgm {
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		System.out.println("BeforeEach method");
		driver =  new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle = driver.getTitle();
		String expected = "Google";
	
		if(actualtitle.equals(expected))
		{
			System.out.println("Matching");
		}
		else
			System.out.println("Not matching");
	}
	
	@Test
	public void method2()
	{
		System.out.println("Method 2");
	}
	
	@AfterEach
		public void teardown()
		{
			System.out.println("AfterEach method");
			driver.quit();  //to close the browser's tab
		}
	}


