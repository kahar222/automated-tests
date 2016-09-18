package com.cybertekusa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
	private WebDriver driver;

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public static final String URL = "http://amazon.com";

	public WebElement getInputBox() {
		return driver.findElement(By.id("twotabsearchtextbox"));
	}
}
