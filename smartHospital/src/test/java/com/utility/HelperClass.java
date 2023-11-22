package com.utility;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.stepdefinition.AdminLoginStepDefinition;

public class HelperClass {
private static HelperClass helperclass;
    public static Logger log; 
	public static WebDriver driver;
	public static WebDriverWait wait;
	public final static int TIMEOUT = 10;
	
	protected HelperClass(){
		log = LogManager.getLogger(AdminLoginStepDefinition.class);
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		log.info("Implicit wait applied");
		driver.manage().window().maximize();
	}
	
	public static void openPage(String url) {
		driver.get(url);
		
	}
	
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(helperclass==null) {
			helperclass = new HelperClass();
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		
		helperclass = null;
	}
 
}


