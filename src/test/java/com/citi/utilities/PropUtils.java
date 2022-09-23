package com.citi.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtils {

	public static String getValue(String propFile,String key) throws IOException {
		
		FileInputStream file = new FileInputStream(propFile);
		Properties prop = new Properties();
		prop.load(file);
		String value = prop.getProperty(key);
		return value;
	}
}
