package testPages;

import org.testng.annotations.Test;

import pages.HomePage;
import testbase.InitalizePage;

public class TestHomePage  extends InitalizePage{
	
	/*HomePage homePage = new HomePage();*/
	
	@Test(priority = 1)
	public void verifyLoginPageNavigation()
	{
		homePage.goToLogin();
	}
	
	@Test(priority = 2)
	public void verifyContactsPageNavigation()
	{
		homePage.goToContacts();
		
	}


}
