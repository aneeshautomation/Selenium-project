package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpracticelogin {
		
		ChromeDriver driver;
		@BeforeEach
		public void openwebpage()
		{
			driver = new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
		}
		
		@Test
		public void login()
		{ 
			WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
			username.sendKeys("student");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("Password123");
			
			WebElement loginbtn = driver.findElement(By.xpath("//button[@id='submit']"));
			loginbtn.click();
			
			System.out.println("Login successful");
		} 
		

	}


