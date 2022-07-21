package TESTNG_TEST;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.Login_pom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTPOM {

	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");	
			
			Login_pom login = PageFactory.initElements(driver, Login_pom.class);
			login.getEmailid().sendKeys("123456");
			
	}
	
	
	
	
	
	
	
	
	
}
