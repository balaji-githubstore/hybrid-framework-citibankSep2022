package com.citi.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationKeywords {

	private WebDriver driver;

	public AutomationKeywords(WebDriver driver) {
		this.driver = driver;
	}

	public void typeOnTextBox(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	public void clickElement(By locator) {
		driver.findElement(locator).click();
	}

	public String getTextFromElement(By locator) {
		return driver.findElement(locator).getText();
	}

}
