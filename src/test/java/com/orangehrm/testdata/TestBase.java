package com.orangehrm.testdata;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.orangehrm.utilities.UtilityMethods;

public class TestBase {

	public WebDriver driver;
	public UtilityMethods utility = new UtilityMethods();
	public String browser = utility.getPropertyValue("Browser");
	public String url = utility.getPropertyValue("url");

	public void launchBrowser(String browserName) {
		String browserPath = "";
		try {
			if (browserName.equals("chrome")) {
				browserPath = System.getProperty("user.dir") + "//BrowserDrivers//chromedriver.exe";
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
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
