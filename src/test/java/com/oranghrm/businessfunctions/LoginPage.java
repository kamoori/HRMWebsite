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
	
	public void enterUserName(String userName)
	{
		try {
			wd.until(ExpectedConditions.visibilityOfElementLocated(userName_InputField));
			
		} catch (Exception e) {
		}
	}

}
