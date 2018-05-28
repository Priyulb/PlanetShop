package com.ta.planetfashion.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	public Base () {
		try {
		 prop = new Properties();
		FileInputStream Ip = new FileInputStream("C:/Users/Admin/eclipse-workspace/PlanetShop/src/main/java/com/ta/planetfashion/config/config.properties");
		
			prop.load(Ip);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public static void initilize() {
		String browserName = prop.getProperty("browser");
		
		/*
		switch broswerName
		
		Case Chrome:*/
			
		
		if(browserName.equalsIgnoreCase("chrome"))	{
			
		//DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
		System.setProperty("webdriver.chrome.driver","C:/Driver/chromedriver.exe");
		//webdriver is an interface
	     driver = new ChromeDriver();	     
	 }
		else if(browserName.equalsIgnoreCase("firefox"))	
		{
		
			//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			System.setProperty("webdriver.gecko.driver", "C:/Driver/geckodriver.exe");
			System.out.println("Debug 1");
			DesiredCapabilities cap = new DesiredCapabilities();
			System.out.println("Debug 2");
			cap.setCapability("marionette", true);
			//webdriver is an interface
			System.out.println("Debug 3");
		     driver = new FirefoxDriver(cap);
		}
		
		 //get url
	     String url =prop.getProperty("url");
	     driver.get(url);
	     
	     //wait
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     //maximizing window
	     driver.manage().window().maximize();
	     
	}
}