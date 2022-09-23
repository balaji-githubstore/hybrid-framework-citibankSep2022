package com.citi.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public Object[][] commonDataProvider(Method method) throws IOException
	{
		//testMethodName is the sheetname
		String testMethodName=method.getName();
		Object[][] data= ExcelUtils.getSheetIntoTwoDimensionalArray("test-data/openemr_data.xlsx", testMethodName);
		
		return data;
	}

	
	
	
//	@DataProvider
//	public Object[][] validCredentialData()
//	{
//		Object[][] main=new Object[2][4];
//		
//		main[0][0]="admin";
//		main[0][1]="pass";
//		main[0][2]="English (Indian)";
//		main[0][3]="OpenEMR";
//		
//		main[1][0]="accountant";
//		main[1][1]="accountant";
//		main[1][2]="English (Indian)";
//		main[1][3]="OpenEMR";
//		
//		return main;
//	}

}
