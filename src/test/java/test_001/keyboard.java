package test_001;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class keyboard {

	public static void main(String[] args) throws Exception  {
          WebDriverManager.chromedriver().setup();
          WebDriver driver=new ChromeDriver();
          driver.get("https://www.facebook.com/");
          driver.manage().window().maximize();
          
        
          WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
          WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
          Actions act=new Actions(driver);
         // act.sendKeys(pass, Keys.ENTER);
          act.keyDown(emailid ,Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
       
          // ctrl a  ----------select
          act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
          // ctrl c ----------- copy
          act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
          
          pass.click();
          
          // ctrl v ----------- paste
          act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
          
          
       String   rm_String = RandomString.make(3);
          
          TakesScreenshot ts=(TakesScreenshot)driver;
          File src=ts.getScreenshotAs(OutputType.FILE);
          
          File dest = new File("C:\\Users\\jadha\\eclipse-workspace\\Nakul_Jadhav_maven_2\\"+rm_String+".png");
          FileHandler.copy(src, dest);      
    
          
          
          
          
          
          
          
          
          
	}

}
