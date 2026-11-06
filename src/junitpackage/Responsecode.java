package junitpackage;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecode {

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeEach
	public void browseropn()
	{
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void statuscode() throws Exception  
	{
		String url = driver.getCurrentUrl();  //to retrieve the current URL
		URI obj = new URI(url);  //to verify that text is in link format
		URL link = obj.toURL();
		HttpURLConnection con = (HttpURLConnection) link.openConnection();
		int response = con.getResponseCode();
		System.out.println("Response code is : "+response);
		
		if(response == 200)
		{
			System.out.println("Link is valid");
		}
		
		else if (response == 404)
		{
			System.out.println("Broken link");
		}
		else
		{
			System.out.println("Other response code");
		}
	}
}
