package testngpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Groupingpgm {

	@BeforeClass(alwaysRun = true)
	void beforecls()
	{
		System.out.println("BeforeClass method");
	}
	
	@Test(priority = 2, groups = "Smoke")
	void methdx()
	{
		System.out.println("Method A");
	}
	
	@Test(priority = 1, groups = "Sanity")
	void methda()
	{
		System.out.println("Method B");
	}
	
	@Test(priority = 3, groups = {"Regression","Smoke"})
	void methdc()
	{
		System.out.println("Method C");
	}
	
	@AfterClass(alwaysRun = true)
	void last()
	{
		System.out.println("AfterClass method");
	}
	
}
