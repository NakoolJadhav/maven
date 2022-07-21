package test_001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement emailid  = driver.findElement(By.id("email"));
	         emailid.sendKeys("test");	
	         
	         WebElement password = driver.findElement(By.id("pass"));
	         password.sendKeys("8237194384");
	         
	         WebElement pass = driver.findElement(By.name("pass"));
	         pass.sendKeys("123456789");
	         Thread.sleep(2000);
	         
	       List<WebElement> list = driver.findElements(By.tagName("a"));
	       System.out.println(list.size());
	         
	         
	         WebElement login = driver.findElement(By.name("login"));
	         login.click();
	}

}
