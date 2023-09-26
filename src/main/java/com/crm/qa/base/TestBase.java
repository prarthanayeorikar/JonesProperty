package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.utils.TestUtil;



public class TestBase {
    public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase() throws IOException 
	{
     prop=new Properties();     
     String path="C:\\Users\\Dell\\eclipse-workspace\\FreeCRM.com\\src\\main\\java\\com\\crm\\qa\\config\\config.propertiesfile";
     FileInputStream fis =new FileInputStream(path);
     prop.load(fis);
	}
	
	public static void initilization() throws IOException {
		
		String BrowserName=prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			prop=new Properties();
			String path ="C:\\Users\\Dell\\eclipse-workspace\\FreeCRM.com\\src\\main\\java\\com\\crm\\qa\\config\\config.properties";
			FileInputStream fis=new FileInputStream(path);
			prop.load(fis);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\FreeCRM.com\\driver\\chromedriver.exe");
			
			
			driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Automation Testing\\FreeCrmApplication\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get(prop.getProperty("url"));
		
	}

}

