package com.orangehrm.regression.LoginLogout;

import org.testng.annotations.Test;

import com.orangehrm.testdata.TestBase;
import com.oranghrm.businessfunctions.HomePage;
import com.oranghrm.businessfunctions.LoginPage;

public class TC_01_Login extends TestBase {

	private LoginPage loginPage;
	private HomePage homePage;
	private String userName;
	private String password;
	private String comments;

	@Test
	public void test() {
		loginPage = new LoginPage(driver);
		userName = utility.getPropertyValue("userName");
		password = utility.getPropertyValue("password");
		homePage = loginPage.doLogin(userName, password);
		comments = homePage.verifyHomePage(comments);

	}

}
