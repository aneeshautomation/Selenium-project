package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoverification {

	
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeEach
	public void webpage()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void locate() throws Exception
	{
		WebElement logo = driver.findElement(By.xpath("//img[@title='Rediffmail']"));
		boolean result = logo.isDisplayed();
		
		if(result==true)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
		
		
		WebElement gender = driver.findElement(By.xpath("//input[contains(@name,'gender') and @type='radio' and @value='f']"));
		boolean radiobtn = gender.isEnabled();
	
		System.out.println("Is Female radio button enabled : "+radiobtn);
		
		WebElement checkbx = driver.findElement(By.xpath("//input[@type='checkbox']"));
		boolean checkboxbtn = checkbx.isSelected();
		
		if(checkboxbtn==true)
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
			checkbx.click();
			Thread.sleep(2000);
		}
	}
	
	@AfterEach
	void closebr()
	{
		driver.quit();
	}
}
