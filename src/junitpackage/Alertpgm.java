package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeEach
	void openpage()
	{
		driver.get("file:///C:/Users/Aneesh%20S/OneDrive/Luminar/Selenium/alert.html");
		driver.manage().window().maximize();
	}
	
	@Test
	void test() throws Exception
	{
		
		WebElement alert = driver.findElement(By.xpath("/html/body/input[1]"));
		alert.click();
		
		//Handling alert box
		Alert alrt = driver.switchTo().alert();  //To switch the control to Alert box
		String alrt_text = alrt.getText();		 //To retrieve the text in the alert box
		System.out.println("Text in the alert box : "+alrt_text);
		
		Thread.sleep(2000);
		alrt.accept();
		
		WebElement username = driver.findElement(By.xpath("/html/body/input[2]"));
		username.sendKeys("aneesh.s");
		
		WebElement pswd = driver.findElement(By.xpath("/html/body/input[3]"));
		pswd.sendKeys("12345678");
		
		WebElement sbmt = driver.findElement(By.xpath("/html/body/input[4]"));
		sbmt.click();
		
		
	}
	
	@AfterEach
	void close()
	{
		driver.quit();
	}
}
