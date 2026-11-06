package testngpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeTest
	void beforetestmethod()
	{
		System.out.println("BeforeTest method");
	}
	
	@BeforeClass
	void beforeclassmethod()
	{
		System.out.println("BeforeClass method");
	}
	
	@BeforeMethod
	void beforemethodtest() 
	{
		System.out.println("BeforeMethod annotation");
	}

	@Test
	void testmethodA()
	{
		System.out.println("Test A");
	}
	
	@Test
	void testmthdX()
	{
		System.out.println("Test X");
	}
	
	@Test
	void testmthdc()
	{
		System.out.println("Test C");
	}
	
	@AfterMethod
	void aftermthd()
	{
		System.out.println("AfterMethod annotation");
	}
	
	@AfterClass
	void aftercls()
	{
		System.out.println("AfterClass method");
	}
	
	@AfterTest
	void aftertst()
	{
		System.out.println("AfterTest method");
	}
	
}
