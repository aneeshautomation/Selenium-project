package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Explicitpgm {
ChromeDriver driver=new ChromeDriver();
	
	@BeforeClass
	void openb()
	{
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	
	@Test
	void waitimp()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a/span")));
		WebElement elect=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a/span"));
		
		Actions act = new Actions(driver);
		act.moveToElement(elect).perform();
		
		//WebElement option = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		//option.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
		
	}
	
	
}
