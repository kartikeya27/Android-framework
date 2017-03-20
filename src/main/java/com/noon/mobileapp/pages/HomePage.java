package com.noon.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends BasePage {
	AndroidDriver<AndroidElement> aDriver;
	ExtentTest test;
	
	@FindBy(xpath=NConstants.NAVIGATION_MENU_IMAGE)
	public AndroidElement navigationMenuImage;
	
	public HomePage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver,test);
	}
	
	public Object selectFromNavigationMenu() {
		test.log(LogStatus.INFO, "Selecteding from navigation menu");
		navigationMenuImage.click();
		return null;
	}
	
	public void gotoCart() {
		
	}
	
}
