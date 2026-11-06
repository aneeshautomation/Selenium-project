package junitpackage;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodepgm2 {

	ChromeDriver driver = new ChromeDriver();
	@BeforeEach
	public void browseropn()
	{
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void linkcount()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links : "+links.size());
		
		for(WebElement li :links)
		{
			String url = li.getAttribute("href");
			try {
				verify(url);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void verify(String url) throws Exception {
		
		try {
		URI obj = new URI(url);
		URL value = obj.toURL();
		HttpURLConnection con = (HttpURLConnection) value.openConnection();
		
		int respcode = con.getResponseCode();
		if(respcode == 200)
		{
			System.out.println("Valid link "+url);
		} 
		else if(respcode == 404)
		{
			System.out.println("Broken link "+url);
		}
		else
		{
			System.out.println("Other response code "+url);
		}
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
		
}
