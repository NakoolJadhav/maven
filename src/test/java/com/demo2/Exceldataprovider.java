package com.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceldataprovider {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
        driver.manage().window().maximize();
       
        String path = "C:\\Users\\jadha\\eclipse-workspace\\Nakul_Jadhav_maven_2\\Test data\\data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String data1 = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    System.out.println(data1);
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data1);
		
	}

}
