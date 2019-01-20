package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Page;
import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class LoginPage extends Page{
	

	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[text() = 'Log In']")
	WebElement loginButton;
	
	
	public HomePage doLogin(String username, String lpassword)
	{
		email.sendKeys(username);
		password.sendKeys(lpassword);
		loginButton.click();
		return new HomePage();
	}

}
