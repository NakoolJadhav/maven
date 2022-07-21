package test_001;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TEST_ASSERTCONCEPT {

	@Test
	public void  m1() {
		
		System.out.println("username");
		System.out.println("password");
		System.out.println("login button");
		
		// verify
		
		String expectedtitle = "Welcome";
		String Actualtitle = "welcome";
		
		Assert.assertEquals(Actualtitle, expectedtitle);
		
		System.out.println("click pn profile");
		
	}
	
	@Test
	public void  m2() {
		
		System.out.println("i am m2");
		
	}
	
}
