package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CopyPaste {

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeClass
	void opens()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	void rediff() throws Exception
	{
		
		WebElement fname = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
		fname.sendKeys("abcd");
		
		// to select the value from fullname field (Ctrl+A)
		Actions act = new Actions(driver);
	   
	    act.keyDown(fname, Keys.CONTROL).sendKeys("a");
	    act.keyUp(Keys.CONTROL);

	    act.keyDown(fname, Keys.CONTROL).sendKeys("c");
	    act.keyUp(Keys.CONTROL);

	    WebElement mail = driver.findElement(By.xpath("//input[contains(@id,'login')]"));

	    act.keyDown(mail, Keys.CONTROL).sendKeys("v");
	    act.keyUp(Keys.CONTROL);
	    
	    act.perform();
	    
	    Thread.sleep(2000);
	}
	
	@AfterClass
	void close()
	{
		driver.quit();
	}
	}
	
