package com.castor.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.castor.constant.CastorConstant;
import com.castor.exception.CastorException;
import com.castor.helper.CommonOperation;

public class BaseClass {

	protected static WebDriver driver = null;
	protected static WebDriverWait wait = null;


	@BeforeTest
	public void setup(){
		try {
			BaseClass.loadURL();
			BaseClass.loadDriver("chrome");
		}catch(Exception exception){
			throw new CastorException(exception.getMessage());
		}
	}

	@AfterTest
	public void tearDown(){
		System.out.println("Inside After Test - TearDown");
		driver.quit();
	}

	public static void loadURL() {
		new CommonOperation(driver);
		driver.get(CastorConstant.URL);
		driver.manage().window().maximize();
		wait = CommonOperation.waitInstance(CastorConstant.SLEEP);
		wait.until(ExpectedConditions.titleContains(CastorConstant.CASTOR_PAGE_TITLE));
	}

	public static WebDriver loadDriver(String browser) {
		if (browser.equalsIgnoreCase(CastorConstant.CHROME_BROWSER)) {
			System.setProperty(CastorConstant.BROWSER_CHORME_PROPERTY, "Your Browser Path");
			driver = new ChromeDriver();
		} else {
			System.out.println("Opps! Issue while loading the Browser");
		}
		return driver;
	}
}
