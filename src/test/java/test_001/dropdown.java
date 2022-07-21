package test_001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(country);
		
		String default_opt = select.getFirstSelectedOption().getText();
		System.out.println(default_opt);
		
		select.selectByIndex(5);
		Thread.sleep(5000);
		select.selectByValue("ALBANIA");
		Thread.sleep(5000);
		select.selectByVisibleText("ANDORRA");
		
		List<WebElement> list = select.getOptions();
	
		for(int i=0;i<list.size();i++) {
			String option = list.get(i).getText();	
	System.out.println(option);
			
			
		}
		}
		
	}


