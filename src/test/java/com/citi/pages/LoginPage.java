package com.citi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.citi.base.AutomationKeywords;

public class LoginPage extends AutomationKeywords {
	
	private By usernameLocator=By.id("authUser");
	private By passwordLocator=By.cssSelector("#clearPass");
	private By languageLocator=By.xpath("//select[@name='languageChoice']");
	private By loginLocator=By.id("login-button");
	private By errorLocator=By.xpath("//*[contains(text(),'Invalid')]");
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
		
	public void enterUsername(String username)
	{
		typeOnTextBox(usernameLocator, username);
	}

	public void enterPassword(String password)
	{
		typeOnTextBox(passwordLocator, password);
	}
	
	public void selectLanguageByText(String language)
	{
		Select selectLan = new Select(driver.findElement(languageLocator));
		selectLan.selectByVisibleText(language);
	}
	
	public void clickOnLogin()
	{
		clickElement(loginLocator);
	}
	
	public String getInvalidErrorMessage()
	{
		return getTextFromElement(errorLocator);
	}
	
}





