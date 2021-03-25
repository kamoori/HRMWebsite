package com.oranghrm.businessfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.testdata.WebActions;

public class HomePage extends WebActions {

	WebDriver driver;
	WebDriverWait ww;

	private By homePageLabel = By.id("branding");

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		ww = new WebDriverWait(driver, 30);

	}

	public String verifyHomePage(String comments) {
		try {
			ww.until(ExpectedConditions.visibilityOfElementLocated(homePageLabel));
			boolean value = driver.findElement(homePageLabel).isDisplayed();
			if (value = true) {
				comments = comments + "<HomePage is displayed>";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return comments;
	}

}
