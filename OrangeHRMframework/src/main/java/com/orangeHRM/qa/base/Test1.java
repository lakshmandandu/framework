package com.orangeHRM.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Test1 {

	public static WebDriver driver;
	public static Properties prop;

public   Test1(){
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/orangeHRM"
				+ "/qa/config/config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}


public static void initialization(){
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/main/java/com/orangeHRM"
				+ "/qa/drivers1/chromedriver.exe");	
		driver = new ChromeDriver(); 
	}
	else if(browserName.equals("FF")){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/src/main/java/com/orangeHRM"
				+ "/qa/drivers/geckodriver.exe");		
		driver = new FirefoxDriver(); 
	}
	
	

	
	System.out.println(prop.getProperty("url"));
	driver.get(prop.getProperty("url"));
	
	/*//Verify loginpage is opened
	WebDriverWait wait = new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));*/
	
	
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	
	System.out.println("URL is opened successfully");
}

	public static void closeApp()
	{
		driver.quit();
	}
}