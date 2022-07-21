package test_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc_001 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().to("https://www.facebook.com/login/");
		
        Thread.sleep(2000);
        
        driver.navigate().back();
        
        Thread.sleep(2000);
        
        driver.navigate().forward();
        
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        
		driver.close();
		
	}

}
