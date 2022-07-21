package TESTNG_TEST;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_002 {

	@Test(priority=-4)
	public void test_a() {
		System.out.println("test a");
	}
	@Test(priority=3,enabled=true)
	public void test_b() {
		System.out.println("test b");
		Assert.assertTrue(false);
	}
	@Test(priority=2)
	public void test_c() {
		System.out.println("test c");
	}
	@Test(priority=1,invocationCount=4)
	public void test_d() {
		System.out.println("test d");
	}
    @Test(dependsOnMethods="test_b")
    public void test_e() {
	System.out.println("test e");
}
	
	
	
}
