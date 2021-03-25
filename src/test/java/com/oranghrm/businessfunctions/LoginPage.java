package com.oranghrm.businessfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.testdata.WebActions;

public class LoginPage extends WebActions {
	public WebDriver driver;
	public WebDriverWait wd;

	private By userName_InputField = By.id("txtUsername");
	private By password_InputField = By.id("txtPassword");
	private By login_button = By.id("btnLogin");
	private String value1;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		wd = new WebDriverWait(driver, 60);
	}

	public String verifyLoginPage(String comments) {
		try {
			wd.until(ExpectedConditions.visibilityOfElementLocated(userName_InputField));
			value1 = "";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return comments;

	}

	public void enterUserName(String userName) {
		try {
			wd.until(ExpectedConditions.visibilityOfElementLocated(userName_InputField));
			enterText(userName_InputField, userName);

		} catch (Exception e) {
		}
	}

	public void enterPassword(String password) {
		try {
			wd.until(ExpectedConditions.visibilityOfElementLocated(password_InputField));
			enterText(password_InputField, password);

		} catch (Exception e) {
		}
	}

	public void clickOnLoginButton() {
		try {
			wd.until(ExpectedConditions.visibilityOfElementLocated(login_button));
			clickOnButton(login_button);
		} catch (Exception e) {
		}

	}

	public HomePage doLogin(String uName, String password) {
		try {
			enterUserName(uName);
			enterPassword(password);
			clickOnLoginButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new HomePage(driver);

	}

}
