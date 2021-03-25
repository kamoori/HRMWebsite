package com.orangehrm.testdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.orangehrm.utilities.UtilityMethods;

public class TestBase {

	public WebDriver driver;
	public UtilityMethods utility = new UtilityMethods();
	public String browser=utility.getPropertyValue("Browser");

	public void launchBrowser(String browserName) {
		String browserPath = "";
		try {
			if (browserName.equals("Chrome")) {
				browserPath = System.getProperty("user.dir") + "//browserDriver//chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", browserPath);
				driver = new ChromeDriver();

			} else if (browserName.equals("ÏE")) {

			} else if (browserName.equals("Firefox")) {

			} else if (browserName.equals("Edge")) {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@BeforeClass
	public void setup() {
		launchBrowser(browser);

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
