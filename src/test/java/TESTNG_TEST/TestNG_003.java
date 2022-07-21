package TESTNG_TEST;

import org.testng.annotations.Test;

public class TestNG_003 {

	@Test(groups= {"sanity"})
	public void m1() {
		System.out.println("m1");
	}
	@Test(groups = {"regression"})
	public void m2() {
		System.out.println("m2");
	}
	@Test(groups = {"sanity"})
	public void m3() {
		System.out.println("m3");
	}
	
	
	
	
}
