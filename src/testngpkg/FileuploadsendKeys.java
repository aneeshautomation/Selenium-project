package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileuploadsendKeys {

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeClass
	void open()
	{
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	
	@Test
	void upld()
	{
		WebElement upbtn = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		upbtn.sendKeys("D:\\Luminar June batch notes\\Manual Testing Interview Quick Revision.pdf");
	}
}
