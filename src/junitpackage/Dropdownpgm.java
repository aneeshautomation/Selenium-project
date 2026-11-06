package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpgm {
	
	ChromeDriver driver = new ChromeDriver();
	Select obj;
	
	@BeforeEach
	void openrediff()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	void drop()
	{
		
		WebElement day = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
		obj=new Select(day);  //creating object for Select class
		obj.selectByIndex(3);  //selecting the 3rd index from the dropdown
		
		WebElement month = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
		obj=new Select(month);
		obj.selectByValue("04");
		
		WebElement year =  driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
		obj=new Select(year);
		obj.selectByVisibleText("1997");	
	}
}		
