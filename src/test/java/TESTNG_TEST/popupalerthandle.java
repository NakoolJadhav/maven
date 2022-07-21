package TESTNG_TEST;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popupalerthandle {

        @Test
        public void verifyalert() throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	WebDriver driver=new ChromeDriver();
        	driver.get("https://demo.guru99.com/test/delete_customer.php");
        	driver.manage().window().maximize();
        	WebElement custid = driver.findElement(By.xpath("//input[@name='cusid']"));
            custid.sendKeys("12346789");
            WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
            submit.click();
            
            Alert  alt = driver.switchTo().alert();
            String text = alt.getText();
            System.out.println(text);
            Thread.sleep(2000);
            
            alt.accept();
            
            Alert alt1 = driver.switchTo().alert();
            String text1 = alt1.getText();
            System.out.println(text1);
            alt1.accept();
        }
		
		
		
		
		
		
		
		
	

	

}
