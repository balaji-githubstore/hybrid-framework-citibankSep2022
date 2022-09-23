package com.citi.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.citi.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {	
	
	@Test
	public void validateTitleTest()
	{
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, "OpenEMR Login");
	}

}
