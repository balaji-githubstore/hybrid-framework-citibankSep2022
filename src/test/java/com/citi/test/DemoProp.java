package com.citi.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DemoProp {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file=new FileInputStream("test-data/data.properties");
		
		
		Properties prop=new Properties();
		prop.load(file);
		
		
		String baseUrl=prop.getProperty("url");
		System.out.println(baseUrl);
		
		
		
	}

}
