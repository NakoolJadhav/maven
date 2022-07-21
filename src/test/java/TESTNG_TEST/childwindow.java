package TESTNG_TEST;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class childwindow {
	
	@Test
	public void testbrowser() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Click Here']"));
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		click.click();
		
	Set<String>	setlist = driver.getWindowHandles();
	System.out.println(setlist);
	
	Iterator<String> it = setlist.iterator();
	while(it.hasNext()) {
		String childwinid = it.next();
	if (!parentwindow.equalsIgnoreCase(childwinid)) {
		driver.switchTo().window(childwinid);
		Thread.sleep(2000);
		WebElement	emailid = driver.findElement(By.xpath("//input[@name='emailid']"));
		emailid.sendKeys("test");
		Thread.sleep(2000);
		driver.close();
	}

	}
	driver.switchTo().window(parentwindow);
	driver.close();
	
	
	
	
	
	
	
		
		
	}
	
	

}
