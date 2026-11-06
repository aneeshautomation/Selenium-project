package testngpkg;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframehandling {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--incognito");

	    driver = new ChromeDriver(options);

	    driver.manage().window().maximize();
	    driver.get("https://keralaproperty.in/member/login/");
		
	}
	
	@Test(priority = 1)
	public void login()
	{
		WebElement uname = driver.findElement(By.id("ulogin"));
		uname.sendKeys("johndoe@gmail.com");
		
		WebElement pswd = driver.findElement(By.id("upass"));
		pswd.sendKeys("12345678");
		
		WebElement submit = driver.findElement(By.id("sub_logbtn"));
		submit.click();
	}

	@Test(priority = 2)
	public void iframemethod()
	{
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		 wait.until(ExpectedConditions.urlToBe("https://keralaproperty.in/member/myhome/"));
		 
		 WebElement addprop = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
		 addprop.click();
		 
		 
		 //Summary textbox is located inside an iframe, we need to switch to the iframe to interact with Summary textbox
		 WebElement frametag = driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
		 driver.switchTo().frame(frametag);
		 
		 WebElement summary = driver.findElement(By.xpath("/html/body"));
		 summary.click();
		 summary.sendKeys("Hello");
		 
		 //get out of iframe
		 driver.switchTo().defaultContent();
		
	}
	
//	@AfterTest
//	public void ends()
//	{
//		driver.quit();
//	}
////	
	
}
