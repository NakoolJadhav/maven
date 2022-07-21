package TESTNG_TEST;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ANNOTATIONTEST {
	
	@BeforeSuite
	public void BS() {
		System.out.println("BS");
	}
	@BeforeClass
	public void BC() {
		System.out.println("BC");
	}
	@BeforeTest
	public void BT() {
		System.out.println("BT");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("BM");
	}
	@Test
	public void Test_1() {
		System.out.println("Test_1");
	}
	@Test
	public void Test_2() {
		System.out.println("Test_2");
	}
	@AfterMethod
	public void AM() {
		System.out.println("AM");
	}
	@AfterTest
	public void AT() {
		System.out.println("AT");
	}
	@AfterClass
	public void AC() {
		System.out.println("AC");
	}
	@AfterSuite
	public void AS() {
		System.out.println("AS");
	}
	
	
	

}
