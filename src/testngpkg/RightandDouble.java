package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RightandDouble {

	ChromeDriver driver = new ChromeDriver();
	@BeforeClass
	void open()
	{
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
	}
	
	@Test
	void rclick()
	{
		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleclick);
		
		WebElement right = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		
		act.contextClick(right);
		
		act.perform();
		
	}
}
