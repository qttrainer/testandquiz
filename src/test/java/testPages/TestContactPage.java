package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactPage;
import pages.HomePage;
import testbase.InitalizePage;

public class TestContactPage extends InitalizePage {
	
/*	ContactPage contactPage = new ContactPage();
	HomePage homePage = new HomePage();*/
	
	@Test( priority = 1)
	public void verifyAddress()
	{
		homePage.goToContacts();
		String address = contactPage.getAddress();
		System.out.println(address);
		Assert.assertEquals(1, 2);
	}
	
	

}
