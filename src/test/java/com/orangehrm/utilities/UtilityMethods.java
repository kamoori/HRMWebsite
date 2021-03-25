package com.orangehrm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class UtilityMethods {

	public String value = "";

	public String getPropertyValue(String property) {

		String fileLoc = System.getProperty("user.dir")
				+ "//src//test//java//com//orangehrm//testdata//config.properties";
		try {
			File file = new File(fileLoc);
			FileInputStream fis = new FileInputStream(file);

			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(property);
			System.out.println(value);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	protected void getvalue() {
		System.out.println("Kiran");
	}

}
