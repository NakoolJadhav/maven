
package test_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_3 {

	public static void main(String[] args) throws InterruptedException {
          WebDriverManager.chromedriver().setup();
          WebDriver driver=new ChromeDriver();
          driver.get("https://www.facebook.com/login/");
          driver.manage().window().maximize();
          
          // Absolute Xpath
          
          WebElement emailid =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[1]/input"));
           emailid.sendKeys("test");

          // relative x path
          
          WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
          password.sendKeys("8237194384");
          
          // attribute x path by formula
          // //tagname[@atrributename='attributevalue']
          WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
          email.sendKeys("hello");
          
          // attribute x path by text
          //  //tagname[text(),'text']
          
          
          
          Thread.sleep(5000);

           WebElement link = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
           link.click();




	}

}
