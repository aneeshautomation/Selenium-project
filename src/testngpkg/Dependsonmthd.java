package testngpkg;

import org.testng.annotations.Test;

public class Dependsonmthd {

	@Test
	void reg()
	{
		System.out.println("Registration method");
	}
	
	@Test(dependsOnMethods = "reg")  //executes only after reg() method
	void login()
	{
		System.out.println("Login method");
	}
	
	@Test(dependsOnMethods = {"reg","login"})
	void home()
	{
		System.out.println("Home method"); 
	}
}
