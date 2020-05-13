package com.qa.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	//create a constructor and define the properties path
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\RamyaPV\\Desktop\\Selenium\\SeleniumCucumberProject\\src\\main\\java\\com\\qa\\config\\configfile.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	//get  the browser  details from properties ,initialize the browser and other page maximize details
	
	public static void initialization() throws InterruptedException {
	
		String BrowserName=prop.getProperty("Browser");
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamyaPV\\Desktop\\Selenium\\SeleniumCucumberProject\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		
		
		
	}

}
