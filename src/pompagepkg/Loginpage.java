package pompagepkg;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	//locating WebElements using Page Factory
	
	@FindBy(xpath="//*[@id=\"ulogin\"]") WebElement username;
	@FindBy(id="upass") WebElement password;
	@FindBy(id="sub_logbtn") WebElement loginbtn;
	
	//Constructor
	
	public Loginpage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,	this);
	}
	
	//Methods
	
	public void setvalues()
	{
		username.sendKeys("johndoe@gmail.com");
		password.sendKeys("12345678");
	}
	
	public void loginmthd()
	{
		loginbtn.click();
	}
	
	public String titlemethod()
	{
		String title = driver.getTitle();
		return title;
	} 
	
}


