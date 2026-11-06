package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertionpgm {

	ChromeDriver driver;
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	void logoverify()
	{
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		boolean result = logo.isDisplayed();
		System.out.println(result);
		
		SoftAssert obj = new SoftAssert();
		obj.assertTrue(result);  //Checking if the value of result is true
		
		obj.assertAll();
		System.out.println("Logo is displayed");
	}
	
	@Test
	void titleverify()
	{
		String actualTitle = driver.getTitle();
		//System.out.println("Actual title : "+actualTitle);
		
		String expected = "Rediffmail Free Unlimited";
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(actualTitle, expected);
		obj.assertAll(); 
		System.out.println("Title verification Success");
		
	}
	
}
