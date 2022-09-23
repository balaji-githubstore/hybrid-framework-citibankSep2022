package com.citi.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.citi.base.AutomationWrapper;
import com.citi.pages.LoginPage;
import com.citi.pages.MainPage;
import com.citi.utilities.DataUtils;

	
public class LoginTest extends AutomationWrapper {

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void validCredentialTest(String username, String password, String language, String expectedTitle) {

		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.selectLanguageByText(language);
		loginPage.clickOnLogin();
		
		
		MainPage mainPage=new MainPage(driver);
		mainPage.waitForPresenceOfCalendar();

		String actualTitle = mainPage.getMainPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void invalidCredentialTest(String username,String password,String language,String expectedError) {
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.selectLanguageByText(language);
		loginPage.clickOnLogin();

		String actualError = loginPage.getInvalidErrorMessage();
		Assert.assertEquals(actualError, expectedError);
	}

}
