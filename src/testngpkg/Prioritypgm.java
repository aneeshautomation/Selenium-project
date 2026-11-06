package testngpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Prioritypgm {

	@BeforeClass
	public void setup()
	{
		System.out.println("BeforeClass");
	}
	
	
	@Test(priority = 2, invocationCount = 3)  //invocationCount = 3 : ,method executes 3 times
	public void test1()
	{
		System.out.println("test1");
	}

	@Test(priority = 1, enabled = false)
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(priority = 3)
	public void test3()
	{
		System.out.println("test3");
	}
	
	@AfterClass
	public void aftercls()
	{
		System.out.println("AfterClass method");
	}
}
