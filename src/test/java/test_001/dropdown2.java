package test_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://demo.guru99.com/test/newtours/register.php");
	    
	    WebElement dropdown = driver.findElement(By.xpath("// select[@name='country']"));
	    dropdown.sendKeys("INDIA");
	    
	    
		
	          
		
	}

}
