package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hardassertion {

	ChromeDriver driver;
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void titleverify()
	{
		String actualTitle = driver.getTitle();
		//System.out.println("Actual title : "+actualTitle);
		
		String expected = "Rediffmail Free Unlimited";
		Assert.assertEquals(actualTitle, expected);
		
		System.out.println("Title verification success");  // Executes only if the assertion is pass
				
	}
	
	@Test(priority=2)
	void urlverify()
	{
		String actualurl = driver.getCurrentUrl();  //to get the URL of current webpage
		//System.out.println("Actual URL : "+actualurl);
		
		String expectedurl = "https://register.rediff.com/register/register.php?FormName=user_details";
		Assert.assertEquals(actualurl, expectedurl);
		
		System.out.println("URL verification complete");
	}
	
}
