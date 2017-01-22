package com.noon.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RegisterPage extends BasePage {

	public RegisterPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver, test);
	}
	
	@FindBy(xpath=NConstants.NAVIGATION_MENU_IMAGE)
	public AndroidElement navigationMenuImage;
	
	@FindBy(xpath=NConstants.SIGN_IN_LINK)
	public AndroidElement signinLink;
	
	@FindBy(xpath=NConstants.REGISTER_TAB)
	public AndroidElement registerTab;
	
	@FindBy(xpath=NConstants.REGISTER_WITH)
	public AndroidElement registerWith;
	
	@FindBy(xpath=NConstants.GOOGLE_BUTTON)
	public AndroidElement googleButton;
	
	@FindBy(xpath=NConstants.FACEBOOK_BUTTON)
	public AndroidElement facebookButton;
	
	@FindBy(xpath=NConstants.TWITTER_BUTTON)
	public AndroidElement twitterButton;
	
	@FindBy(xpath=NConstants.REGISTER_DETAILS)
	public AndroidElement registerDetails;
	
	@FindBy(xpath=NConstants.REGISTER_NAME)
	public AndroidElement registerName;
	
	@FindBy(xpath=NConstants.REGISTER_EMAIL)
	public AndroidElement registerEmail;
	
	@FindBy(xpath=NConstants.USE_MOBILE)
	public AndroidElement useMobile;
	
	@FindBy(xpath=NConstants.PASSWORD_VIEW_IMAGE)
	public AndroidElement passwordViewImage;
	
	@FindBy(xpath=NConstants.REGISTER_PASSWORD)
	public AndroidElement registerPassword;
	
	public void registerTest() {
		
		test.log(LogStatus.INFO, "Selecting home button from navigation menu");
		navigationMenuImage.click();
		
		test.log(LogStatus.INFO, "Sign in inside Application - ");
		
		WebDriverWait wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_LINK)));
		Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_LINK), "Could not find sign in link");
		signinLink.click();
		
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.REGISTER_TAB)));
		Assert.assertTrue(isElementPresent(NConstants.REGISTER_TAB), "Could not find registration tab");
		registerTab.click();
		
		Assert.assertTrue(isElementPresent(NConstants.REGISTER_TAB), "Could not find registration tab");
		Assert.assertTrue(isElementPresent(NConstants.REGISTER_WITH), "Could not find registration with text");
		Assert.assertTrue(isElementPresent(NConstants.GOOGLE_BUTTON), "Could not google button");
		Assert.assertTrue(isElementPresent(NConstants.FACEBOOK_BUTTON), "Could not find facebook button");
		Assert.assertTrue(isElementPresent(NConstants.TWITTER_BUTTON), "Could not find twitter button");
		Assert.assertTrue(isElementPresent(NConstants.REGISTER_NAME), "Could not find registration name field");
		Assert.assertTrue(isElementPresent(NConstants.REGISTER_EMAIL), "Could not find registration email address field");
		Assert.assertTrue(isElementPresent(NConstants.USE_MOBILE), "Could not find use moabile number link");
		Assert.assertTrue(isElementPresent(NConstants.PASSWORD_VIEW_IMAGE), "Could not find password view image");
		Assert.assertTrue(isElementPresent(NConstants.REGISTER_PASSWORD), "Could not find create password field");
		Dimension dimensions = aDriver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		aDriver.swipe(0,scrollStart,0,scrollEnd,2000);
		Assert.assertTrue(isElementPresent(NConstants.REGISTER_BUTTON), "Could not find registration button");


		
	}

}
