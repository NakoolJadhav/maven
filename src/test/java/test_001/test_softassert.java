package test_001;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test_softassert {

	@Test
	public void m() {
		
		SoftAssert soft=new SoftAssert();
				
		System.out.println("username");
		System.out.println("password");
		System.out.println("login button");
		
		soft.assertEquals("nakul", "Test1");
		
		System.out.println("click on profile");
		
		soft.assertAll();
	}
	
	
	
	
	
}
