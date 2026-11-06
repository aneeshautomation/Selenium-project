package testngpkg;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUploadRobot {

ChromeDriver driver = new ChromeDriver();
	
	@BeforeClass
	void open()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
	}
	
	@Test
	void uploading() throws Exception
	{
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"pickfiles\"]"));
		btn.click();
		
		FileUpload("D:\\Luminar June batch notes\\Defects.pdf");
	}

	private void FileUpload(String p) throws Exception {
		
		StringSelection strobj = new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strobj, null);
		
		Robot rob = new Robot();
		rob.delay(3000);
		
		rob.keyPress(KeyEvent.VK_CONTROL);  //VK - Virtual Key
		rob.keyPress(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		rob.delay(2000);
		System.out.println("File uploaded successfully");
		
	}
}
