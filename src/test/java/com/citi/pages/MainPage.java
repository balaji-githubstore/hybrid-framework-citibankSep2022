package com.citi.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

	private By calendarLocator = By.xpath("//div[text()='Calendar']");

	private WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public void waitForPresenceOfCalendar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.presenceOfElementLocated(calendarLocator));
	}

	public String getMainPageTitle() {
		return driver.getTitle();
	}

	public void clickOnCalendar() {
		driver.findElement(calendarLocator).click();
	}

}
