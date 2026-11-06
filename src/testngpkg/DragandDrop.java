package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragandDrop {

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeClass
	void open()
	{
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
	}
	
	@Test
	void drop() throws Exception
	{
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		 	
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).perform();
		
		Thread.sleep(2000);
		
		WebElement hoverbtn = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		
		act.moveToElement(hoverbtn).perform();
		
		WebElement link1 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
		link1.click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		
		al.accept();
		
		WebElement holdbtn = driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
		
		act.clickAndHold(holdbtn).perform();
		
		
		WebElement dblck = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
		act.doubleClick(dblck).perform();
		Thread.sleep(2000);
		
	}
	
	@AfterClass
	void quit()
	{
		driver.quit();
	}
}
