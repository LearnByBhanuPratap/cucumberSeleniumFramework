package com.cucumber.framework.helper.assertionHelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;



public class VerificationHelper{

	private static final  Logger log = LoggerHelper.getLogger(VerificationHelper.class);

	public static synchronized boolean verifyElementPresent( WebElement element) {
		boolean isDispalyed = false;
		try {
			 isDispalyed= element.isDisplayed();
		}
		catch(Exception ex) {
			log.error("Element not found " + ex);
		}
		
		return isDispalyed;
	}
	
	public static synchronized boolean verifyElementNotPresent( WebElement element) {
		boolean isDispalyed = false;
		try {
			 element.isDisplayed();
		}
		catch(Exception ex) {
			log.error("Element not found " + ex);
			isDispalyed = true;
		}
		
		return isDispalyed;
	}
	
	public static synchronized boolean verifyTextEquals( WebElement element,String expectedText) {
		boolean flag = false;
		try {
			String actualText=element.getText();
			if(actualText.equals(expectedText)) {
				return flag=true;
			}
			else {
				return flag;
			}
		}
		catch(Exception ex) {
			log.info("Element not found " + ex);
			return flag;
		}
	}
}