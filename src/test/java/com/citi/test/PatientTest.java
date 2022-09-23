package com.citi.test;

import org.testng.annotations.Test;

import com.citi.base.AutomationWrapper;
import com.citi.pages.LoginPage;
	
public class PatientTest extends AutomationWrapper{
	
	@Test
	public void addPatientTest()
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername("admin");
		loginPage.enterPassword("pass");
		loginPage.clickOnLogin();
	}

}
