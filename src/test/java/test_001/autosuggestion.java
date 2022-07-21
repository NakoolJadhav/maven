package test_001;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestion {

	public static void main(String[] args) throws InterruptedException  {
	// OPEN BROWSER
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new  ChromeDriver();
	// OPEN URL
		driver.get("https://www.google.com/");
	//SEND VALUE TO SEARCHABR MAVEN
		WebElement searchbar = driver.findElement(By.xpath("//input[@name='q']"));
        searchbar.sendKeys("maven");
    // VERIFY AUTOSUGGESTION
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
        System.out.println(list.size());
		System.out.println(list.get(2).getText());
	    for (int i=0;i<list.size();i++) {
	    	if(list.get(i).getText().equals("maven dependency")) {
	    		list.get(i).click();
	    	}
	    }
		
		
		
		
		
		
		
		
		
        }
                 

	}


