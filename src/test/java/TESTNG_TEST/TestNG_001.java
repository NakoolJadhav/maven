package TESTNG_TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_001 {
	WebDriver driver;
	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() {
		WebElement emailid  = driver.findElement(By.id("email"));
        emailid.sendKeys("test");	
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("8237194384");
	}
	@Test
	public void test2() {
		WebElement emailid  = driver.findElement(By.id("email"));
        emailid.sendKeys("test");	
        
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("8237194384");
	}
	@Test
	public void test3() {
		WebElement emailid  = driver.findElement(By.id("email"));
        emailid.sendKeys("test");	
        
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("8237194384");
	}@Test
	public void test4() {
		WebElement emailid  = driver.findElement(By.id("email"));
        emailid.sendKeys("test");	
        
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("8237194384");
	}
	@AfterMethod
	public void AM() {
		driver.close();
	}

}
