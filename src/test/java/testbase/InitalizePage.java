package testbase;

import pages.ContactPage;
import pages.HomePage;
import pages.LoginPage;

public class InitalizePage {
	public static ContactPage contactPage ;
	public static HomePage homePage; 
	public static LoginPage loginPage;
	
	public static Boolean isIntialize = false;
	protected InitalizePage()
	{
		if(!isIntialize)
		{
		contactPage = new ContactPage();
		homePage = new HomePage();
		loginPage = new LoginPage();
		isIntialize = true;
		}
		
	}
	
	

}
