package com.castor.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.castor.constant.CastorConstant;

public class CommonOperation {
	// here will keep all the common method used across the framework.
	
	private static WebDriver driver;
	private static WebDriverWait wait;
	
	public CommonOperation(WebDriver driver){
		CommonOperation.driver = driver;
		wait = new WebDriverWait(driver, CastorConstant.SLEEP);
	}
	
	public static WebDriverWait waitInstance(long timeOutInSeconds) {
		return new WebDriverWait(driver, timeOutInSeconds);
	}
	
	public static void elementClick(By locator) {
		waitUntilVisibility(locator);
		driver.findElement(locator).click();
	}
	
	public static void sendkeys(By locator, String data) {
		driver.findElement(locator).sendKeys(data);
	}
	
	public static String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public static void waitUntilVisibility(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
