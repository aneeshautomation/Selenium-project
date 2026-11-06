package homework;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NaukriMyWork {

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeMethod
	void setup()
	{
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void updateprofile() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement uname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameField")));
		uname.sendKeys("aneesh1369000@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"passwordField\"]"));
		pass.sendKeys("#1NaukriAcc");
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).click();
		
		
		//logged in
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		//Menu
		WebElement menu =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[5]/button/div[1]")));
		menu.click();
		
		//click view and update profile
		WebElement profileupd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[5]/div/div[2]/div/div[1]/div[2]/a")));
		profileupd.click();
		
		driver.findElement(By.xpath("//em[@aria-label='Edit basic details']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"saveBasicDetailsBtn\"]")).click();
		
		//Success popup
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement closepopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div[1]/span")));
		
		closepopup.click();
		
		//logout button click
		
		By menulocator = By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[5]/button");
		
		WebElement menubutton = wait.until(ExpectedConditions.elementToBeClickable(menulocator));
		
		menubutton.click();
	
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[5]/div/div[2]/div/div[4]/div/div[1]/div[4]/a"));
		logout.click();
		
		System.out.println("Naukri profile updated");
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}

