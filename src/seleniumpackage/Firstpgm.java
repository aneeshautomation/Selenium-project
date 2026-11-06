package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstpgm {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();  //for opening chrome browser
		
		//EdgeDriver driver = new EdgeDriver();  //for opening Edge browser
		//FirefoxDriver driver = new FirefoxDriver(); //for opening Firefox browser
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle(); //to retrieve the title of the web application
		System.out.println("Title : "+actualTitle); 
		
		String expectedTitle="Google";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Titles matching");
		}
		else
			System.out.println("Not matching");
	}

}
