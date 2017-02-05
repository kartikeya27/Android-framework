package com.noon.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
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
	
	@FindBy(xpath=NConstants.GOOGLE_BUTTON)
	public AndroidElement googleButton;
	
	@FindBy(xpath=NConstants.SIGNIN_EMAIL)
	public AndroidElement signinEmail;
	
	//@FindBy(className=NConstants.NAME)
	//public AndroidElement name;
	
	@FindBy(xpath=NConstants.PASSWORD_TAB)
	public AndroidElement passwordTab;
	
	@FindBy(xpath=NConstants.SIGNIN_PASSWORD)
	public AndroidElement signinPassword;
	
	@FindBy(xpath=NConstants.SIGNIN_BUTTON)
	public AndroidElement signinButton;
	
    @FindBy(xpath=NConstants.MY_ACCOUNT)
    public AndroidElement myAccount;
    
    @FindBy(xpath=NConstants.MY_ORDERS)
    public String myOrders;
    
    @FindBy(xpath=NConstants.RETURN_EXCHANGE)
    public String returnExchange;
    
    @FindBy(xpath=NConstants.ADDRESS_BOOK)
    public String addressBook;
    
    @FindBy(xpath=NConstants.WALLET)
    public String wallet;
    
    @FindBy(xpath=NConstants.MY_PROFILE)
    public WebElement myProfile;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_IMAGE)
    public WebElement myProfileUserImage;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_NAME)
    public WebElement myProfileUserName;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_EMAIL)
    public WebElement MyprofileUserEmail;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_PASSWORD)
    public WebElement myProfileUserPassword;
    
    @FindBy(xpath=NConstants.MY_PROFILE_USER_FRAGMENT_PASSWORD)
    public WebElement myProfileUserFragmentPassword;

    @FindBy(xpath=NConstants.MY_PROFILE_USER_SIGNOUT)
    public WebElement myProfileUserSignout;
    
	
	
	public void signin(String userName, String userPassword) {
		
		/*WebDriverWait wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.INITIAL_SCREEN)));
		test.log(LogStatus.INFO, "Allow noon sit to access photos,media, and files on your device?");
		initialScreen.click();*/
		
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
		
		
		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_EMAIL), "Could not find email address field");
		signinEmail.sendKeys(userName);
		aDriver.hideKeyboard();
		
		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_PASSWORD), "Could not find password field");
		signinPassword.sendKeys(userPassword);
		aDriver.hideKeyboard();
		
		
		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_BUTTON), "Could not find Sign in button");
		signinButton.click();
		
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
		navigationMenuImage.click();
		
		Assert.assertTrue(isElementPresent(NConstants.HELLO_TEXT), "Could not find Hello,");
		Assert.assertTrue(isElementPresent(NConstants.USER_TEXT), "Could not find user name");
		
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ACCOUNT)));
		myAccount.click();
		
		for(int i=0;i<8;i++) {
			Dimension size = aDriver.manage().window().getSize();
			int startx = (int) (size.width * 0.70);
			int endx = (int) (size.width * 0.30);
			int starty = size.height / 2;
        	aDriver.swipe(startx, starty, endx, starty, 2000); 
        }
		wait = new WebDriverWait(aDriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_PROFILE)));
        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE), "Could not my profile text");
		myProfile.click();
		
		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_IMAGE), "Could not find user image");
		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_NAME), "Could not find user name text");
		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_EMAIL), "Could not find user email text");
		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_PASSWORD), "Could not find user password text");
		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_FRAGMENT_PASSWORD), "Could not find user framgement password text");
		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_SIGNOUT), "Could not sign out button");
		myProfileUserSignout.click();
		//return signin(userPassword, userPassword);
	}
	
}
