package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_pom {

	@FindBy(how = How.XPATH,using= "//input[@id='email']")
	private WebElement emailid;
	@FindBy(how = How.XPATH,using ="//input[@id='pass']")
	private WebElement password;
	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}
	

	
}
