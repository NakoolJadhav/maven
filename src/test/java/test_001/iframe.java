package test_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

	@Test
	public void test_01() {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/jadha/frame.html");
		driver.manage().window().maximize();
		
		WebElement frame_1 = driver.findElement(By.xpath("//iframe[@name='Selenium']"));
		driver.switchTo().frame(frame_1);
		
		WebElement icon = driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']"));
		icon.click();
		
		driver.switchTo().defaultContent();
		
		WebElement login = driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']"));
		login.click();
		
		
	}
	
	
}
