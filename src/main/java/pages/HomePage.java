package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Page;

public class HomePage extends Page {
	
	static Logger logger = LogManager.getLogger(HomePage.class.getName());
	
	@FindBy(xpath = "//a[@href='/user-login']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[text() = 'Contact Us']")
	WebElement contacts;
	
	public void goToLogin()
	{
		loginButton.click();
		logger.info("clicking on button");
		//return new LoginPage();
	}
	
	public void goToContacts()
	{
		contacts.click();
		logger.error("click on contacts");
		
		
	}

}
