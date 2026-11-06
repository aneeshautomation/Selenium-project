package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert { 

	
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeEach
	void openpage()
	{
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	}
	
	@Test
	void alerthandling() throws Exception
	{
		WebElement alertok = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		alertok.click();
		
		Alert al = driver.switchTo().alert();
		
		String alText = al.getText();
		System.out.println("Alert text : "+alText);
		
		Thread.sleep(2000);
		al.accept();
		
		WebElement alertTwo = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertTwo.click();
		
		WebElement alertTwobtn = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		alertTwobtn.click();
		
		Alert al2 = driver.switchTo().alert();
		
		Thread.sleep(2000);
		al2.dismiss();
		
		WebElement alertThree = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alertThree.click();
		
		WebElement alertThreebtn = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		alertThreebtn.click();
		
		Alert al3 = driver.switchTo().alert();
		
		al3.sendKeys("Test");
		Thread.sleep(2000);
		al3.accept();
		
	}
	
	@Test
	void exit ()
	{
		driver.quit();
	}
}
