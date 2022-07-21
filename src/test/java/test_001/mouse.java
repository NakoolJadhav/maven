package test_001;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class mouse {

	public static void main(String[] args) throws IOException  {

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

driver.get("https://www.google.com/");
driver.manage().window().maximize();

	WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(gmail).perform();
		
		String rs = RandomString.make(5);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File  src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\jadha\\eclipse-workspace\\Nakul_Jadhav_maven_2\\"+rs+"png");
		FileHandler.copy(src, dest);
		
		
		
		
		
	}

}
