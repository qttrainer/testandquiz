package testPages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import testbase.InitalizePage;

public class TestLoginPage extends InitalizePage {

	/*LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();*/


	@Test(dataProvider = "testname", priority = 1)
	public void dologinTest(String username, String password) {
		homePage.goToLogin();
		loginPage.doLogin(username, password);
	}

	@DataProvider(name = "testname")
	public Object[][] getData() {
		String[][] obj = { { "kietmca14@gmail.com", "9899445368" } };
		return obj;
	}

}
