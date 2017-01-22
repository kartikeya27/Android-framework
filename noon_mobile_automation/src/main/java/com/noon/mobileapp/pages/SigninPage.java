package com.noon.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class SigninPage extends BasePage {

	public SigninPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver, test);
	}
	
	@FindBy(xpath=NConstants.INITIAL_SCREEN)
	public AndroidElement initialScreen;
	
	@FindBy(xpath=NConstants.NAVIGATION_MENU_IMAGE)
	public AndroidElement navigationMenuImage;
	
	@FindBy(xpath=NConstants.SIGN_IN_LINK)
	public AndroidElement signinLink;
	
	@FindBy(xpath=NConstants.SIGN_IN_TAB)
	public AndroidElement signinTab;
	
	@FindBy(xpath=NConstants.NAME)
	public AndroidElement name;
	
	@FindBy(xpath=NConstants.PASSWORD_TAB)
	public AndroidElement passwordTab;
	
	@FindBy(xpath=NConstants.PASSWORD)
	public AndroidElement password;
	
	@FindBy(xpath=NConstants.SIGN_IN_BUTTON)
	public AndroidElement signinButton;
	
	@FindBy(xpath=NConstants.SHOP_NOW)
	public AndroidElement shopNow;
	
	public void signin(String userName, String userPassword) {
		
		
		//initialScreen.click();
		
		WebDriverWait wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
		
		test.log(LogStatus.INFO, "Selecting home button from navigation menu");
		navigationMenuImage.click();
		
		test.log(LogStatus.INFO, "Sign in inside Application - ");
		
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_LINK)));
		
		Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_LINK), "Could not find sign in link");
		signinLink.click();
		
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_TAB)));
		
		Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_TAB), "Could not find sign in tab");
		signinTab.click();
		
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAME)));
		
		Assert.assertTrue(isElementPresent(NConstants.NAME), "Could not find email address field");
		name.clear();
		
		name.sendKeys(userName);
		aDriver.hideKeyboard();
		//aDriver.pressKeyCode(AndroidKeyCode.BACK);
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PASSWORD)));
		
		
		passwordTab.sendKeys(Keys.TAB);
		//aDriver.hideKeyboard();
		Assert.assertTrue(isElementPresent(NConstants.PASSWORD), "Could not find password field");
		password.clear();
		
		password.sendKeys(userPassword);
		aDriver.hideKeyboard();
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_BUTTON)));
		
		Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_BUTTON), "Could not find Sign in button");
		
		signinButton.click();
		//aDriver.hideKeyboard();
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SHOP_NOW)));
		Assert.assertTrue(isElementPresent(NConstants.SHOP_NOW), "Could not find IPhone 7 image");
		
		/*Assert.assertTrue(isElementPresent(NConstants.SEARCH_AREA), "Could not find search area");
		searchArea.clear();
		searchArea.sendKeys("Timebalm Primer");
		searchArea.sendKeys(Keys.RETURN);*/
		
		
		//return signin(userPassword, userPassword);
	}
	
}
