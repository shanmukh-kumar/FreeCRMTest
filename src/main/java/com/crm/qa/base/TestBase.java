package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	static WebDriver driver;
	static Properties prop;
	
	
	public TestBase () {
		
		try {
			prop = new Properties();
			FileInputStream ip =new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\FreeCrmTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void initialization (){
		String browserName= prop.getProperty("Browser");
		if(browserName.endsWith("chrome"));
		System.setProperty(browserName, "write");
		
	}

}
