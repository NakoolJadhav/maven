package TESTNG_TEST;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlink {
	WebDriver driver;
	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void test_01() throws IOException {
	List<WebElement>  list = driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	
	for (int i=0;i<list.size();i++) {
	WebElement ele = list.get(i);
	String url=ele.getAttribute("href");
	URL url1=new URL(url);
	HttpURLConnection httpurl = (HttpURLConnection) url1.openConnection();
	httpurl.connect();
	int repcode = httpurl.getResponseCode();
	if(repcode>=400) {
		System.out.println(url +" - "+"is broken link");
	}else {
		System.out.println(url +" - "+" is valid link");
	}
	}


	}
	@AfterMethod
	public void AM() {
		driver.close();
	}
	
}
