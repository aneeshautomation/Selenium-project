package pomtestpkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pombasepkg.Baseclass; 
import pompagepkg.Loginpage;

public class Logintest extends Baseclass{  //To inherit the driver information from Base class 

	Loginpage obj;
	
	@BeforeMethod
	public void objectmethod()
	{
		obj = new Loginpage(driver);
	} 
	
	@Test
	public void logintest()
	{
		obj.setvalues(); 
		obj.loginmthd(); 
		
	}
	
	@Test
	public void titleverification()
	{
		System.out.println(obj.titlemethod());
	}
}
