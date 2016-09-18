package com.cybertekusa.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	private static WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/selenium libraries/chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
