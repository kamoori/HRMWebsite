package com.orangehrm.testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebActions {

	public WebDriver driver;

	public WebActions(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnButton(By ele) {
		try {
			waitForSeconds(2);
			driver.findElement(ele).click();
		} catch (Exception e) {
		}
	}

	public void enterText(By ele, String text) {
		try {
			waitForSeconds(2);
			driver.findElement(ele).sendKeys(text);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void waitForSeconds(int value) {

		try {
			Thread.sleep(value * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
