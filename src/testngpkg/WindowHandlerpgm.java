package testngpkg;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandlerpgm {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
		
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentwindow = driver.getWindowHandle();
		
		WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchbar.sendKeys("Mobiles");
		
		WebElement icon = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		icon.click();
		
		WebElement phnlink = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span"));
		phnlink.click();
		
		/* Tab details can also be stored into an ArrayList
		 * ArrayList<String> windowdetails = new ArrayList<>(driver.getWindowHandles());
		 * driver.switchTo().window(windowdetails.get(1)); //redirect to 1st tab(index)
		 */	
		
		Set<String> tabdetails = driver.getWindowHandles();
		
			
		for(String handle : tabdetails)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				System.out.println(driver.getCurrentUrl());
			}
		}
		
	}
	
	
}
