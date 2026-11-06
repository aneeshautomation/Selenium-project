package homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Datepickerpgm {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
	}
	
	@Test
	void datepick()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement currentdate = driver.findElement(By.id("datepicker1"));
		currentdate.click();
		
	    while (true)      // Find Month
	    {
	        String month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();   // locate

	        System.out.println("month=" + month);

	        if (month.equalsIgnoreCase("December 2026"))
	        {
	            break;
	        }
	        else
	        {
	            WebElement nextarrow = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
	            nextarrow.click();    // click on the next icon
	        }
	    }   // month selected
	    
	    
	    List<WebElement> date =driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
	    
	    for(WebElement d : date)
	    {
	    		String datetext = d.getText();
	    		if(datetext.equals("15"))
	    		{
	    			d.click();
	    			System.out.println("Date selected");
	    			
	    		}
	    }
	    
	}
	
	
}
