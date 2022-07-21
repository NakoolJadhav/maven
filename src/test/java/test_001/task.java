package test_001;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task {
WebDriver driver;
	@Test 
	public void test_1() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement searchbar = driver.findElement(By.xpath("//input[@type='text']"));
	searchbar.sendKeys("mobiles");
	WebElement button = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	button.click();
	Thread.sleep(2000);
}
 @Test
 public void test_02() throws InterruptedException {
	String a="(//img[@class='s-image'])[1]";
	WebElement firstM=  driver.findElement(By.xpath("a"));
	 firstM.click();
	 Thread.sleep(5000);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
	
	
	
	
	
	
}
