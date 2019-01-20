package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Page;

public class ContactPage extends Page{
	
	@FindBy(xpath = "//p[text() = ' Noida, Uttar Pradesh inc, ']")
	WebElement address;
	
	public String getAddress()
	{
		return address.getText();
	}

}
