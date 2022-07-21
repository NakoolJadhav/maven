package test_001;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
// scrolling using pixel		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
// scrolling using webelement
        WebElement eng =driver.findElement(By.xpath("//li[text()='English (UK)']"));
        js.executeScript("arguments[0].scrollIntoView()",eng);
        
        
        
	}

}
