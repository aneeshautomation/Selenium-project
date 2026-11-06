package homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Actionshw {

	
	ChromeDriver driver = new ChromeDriver();
	@BeforeClass
	void openb()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	
	@Test
	void activity() throws Exception
	{
		WebElement rclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act = new Actions(driver);
		
		act.contextClick(rclick).perform();
		
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		edit.click();
		
		Alert al = driver.switchTo().alert();
		
		al.accept();
		
		WebElement dclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dclick);
		act.perform();
		
		Thread.sleep(2000);
		Alert al2 = driver.switchTo().alert();
		al2.accept();
		
	}
	
}
