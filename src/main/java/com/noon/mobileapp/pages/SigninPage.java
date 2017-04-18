package com.noon.mobileapp.pages;

import io.appium.java_client.MobileElement;
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
	
	@FindBy(xpath=NConstants.NAVIGATION_MENU_IMAGE)
	public AndroidElement navigationMenuImage;
	
	@FindBy(xpath=NConstants.SIGN_IN_LINK)
	public AndroidElement signinLink;
	
	@FindBy(xpath=NConstants.SIGN_IN_TAB)
	public AndroidElement signinTab;
	
	@FindBy(xpath=NConstants.SIGNIN_WITH)
	public AndroidElement signinWith;
	
	@FindBy(xpath=NConstants.SIGNIN_DETAILS)
	public AndroidElement  signinDetails;
	
	@FindBy(xpath=NConstants.GOOGLE_BUTTON)
	public AndroidElement googleButton;
	
	@FindBy(xpath=NConstants.GOOGLE_SIGNIN)
	public AndroidElement googleSingin;
	
	@FindBy(xpath=NConstants.SIGNIN_EMAIL)
	public AndroidElement signinEmail;
	
	@FindBy(className=NConstants.MOBILE_NUMBER_LINK)
	public AndroidElement mobileNumberLink;
	
	@FindBy(xpath=NConstants.EMAIL_LINK)
	public AndroidElement emailLink;
	
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

    @FindBy(xpath=NConstants.MENU_HOME)
    public AndroidElement navigationMenuHome;

    @FindBy(xpath=NConstants.SIGN_IN_MAIN)
    public AndroidElement signinMain;

    @FindBy(xpath=NConstants.HELLO_LABEL)
    public AndroidElement helloLabelSideMenu;

    @FindBy(xpath=NConstants.SIGNIN_PHONE)
    public AndroidElement signinPhone;

    @FindBy(xpath=NConstants.LOGIN_FB)
    public AndroidElement signinFB;

   @FindBy(xpath=NConstants.FB_LOGIN_BTN)
    public AndroidElement loginBtnFB;

   @FindBy(xpath=NConstants.FB_UESR)
    public AndroidElement userFB;

    @FindBy(xpath=NConstants.FB_PASS)
    public AndroidElement passFB;

    @FindBy(xpath=NConstants.FB_OK_BTN)
    public AndroidElement okFB;

    @FindBy(xpath=NConstants.LOGIN_GOOGLE)
    public AndroidElement signinGoogle;

    @FindBy(xpath=NConstants.GOOGLE_USER)
    public AndroidElement userGoogle;

    @FindBy(xpath=NConstants.GOOGLE_PASS)
    public AndroidElement passGoogle;

    @FindBy(xpath=NConstants.GOOGLE_NEXT)
    public AndroidElement btnNext;

    @FindBy(xpath=NConstants.GOOGLE_NEXT2)
    public AndroidElement btnNext2;

    @FindBy(xpath=NConstants.GOOGLE_ACCEPT)
    public AndroidElement btnAccept;



    public void signinWithEmail(String userName, String userPassword) throws InterruptedException {
		
		test.log(LogStatus.INFO, "Launch Android Application - ");
		WebDriverWait wait = new WebDriverWait(aDriver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
//		test.log(LogStatus.INFO, "Selecting home button from navigation menu");
//		navigationMenuImage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_MAIN)));
		Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_MAIN), "Could not find sign link");
        signinMain.click();

        super.allowAppPermission();

		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_TAB)));
		Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_TAB), "Could not find sign in tab");
		signinTab.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.EMAIL_LINK)));
        Assert.assertTrue(isElementPresent(NConstants.EMAIL_LINK), "Could not find email link");
        emailLink.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_EMAIL)));
		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_EMAIL), "Could not find email address field");
		signinEmail.sendKeys(userName);
//		signinEmail.replaceValue(userName);
		aDriver.hideKeyboard();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_PASSWORD)));
		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_PASSWORD), "Could not find password field");
		signinPassword.sendKeys(userPassword);
//		signinPassword.replaceValue(userPassword);
		aDriver.hideKeyboard();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_BUTTON)));
		Assert.assertTrue(isElementPresent(NConstants.SIGNIN_BUTTON), "Could not find Sign in button");
		signinButton.click();

		
//		wait = new WebDriverWait(aDriver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ORDERS)));
//		Assert.assertTrue(isElementPresent(NConstants.MY_ORDERS), "Could not find My Orders section");
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ACCOUNT)));
//        Assert.assertTrue(isElementPresent(NConstants.MY_ACCOUNT), "Could not find My Account button");
////          myAccount.click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MENU_HOME)));
//        Assert.assertTrue(isElementPresent(NConstants.MENU_HOME), "Could not find HOME button");

	}

    public void signinWithPhone(String phone, String userPassword) throws InterruptedException {

        test.log(LogStatus.INFO, "Launch Android Application - ");
        WebDriverWait wait = new WebDriverWait(aDriver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
//		test.log(LogStatus.INFO, "Selecting home button from navigation menu");
//		navigationMenuImage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_MAIN)));
        Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_MAIN), "Could not find sign link");
        signinMain.click();

        super.allowAppPermission();

        wait = new WebDriverWait(aDriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_TAB)));
        Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_TAB), "Could not find sign in tab");
        signinTab.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_PHONE)));
        Assert.assertTrue(isElementPresent(NConstants.SIGNIN_EMAIL), "Could not find phone field");
        signinPhone.sendKeys(phone);
//		signinEmail.replaceValue(userName);
        aDriver.hideKeyboard();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_PASSWORD)));
        Assert.assertTrue(isElementPresent(NConstants.SIGNIN_PASSWORD), "Could not find password field");
        signinPassword.sendKeys(userPassword);
//		signinPassword.replaceValue(userPassword);
        aDriver.hideKeyboard();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_BUTTON)));
        Assert.assertTrue(isElementPresent(NConstants.SIGNIN_BUTTON), "Could not find Sign in button");
        signinButton.click();


//		wait = new WebDriverWait(aDriver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ORDERS)));
//		Assert.assertTrue(isElementPresent(NConstants.MY_ORDERS), "Could not find My Orders section");
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ACCOUNT)));
//        Assert.assertTrue(isElementPresent(NConstants.MY_ACCOUNT), "Could not find My Account button");
////          myAccount.click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MENU_HOME)));
//        Assert.assertTrue(isElementPresent(NConstants.MENU_HOME), "Could not find HOME button");

    }

    public void verifyLogin(){

        WebDriverWait wait = new WebDriverWait(aDriver, 30);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
//        Assert.assertTrue(isElementPresent(NConstants.NAVIGATION_MENU_IMAGE), "Could not find Menu button");
//        navigationMenuImage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
        Assert.assertTrue(isElementPresent(NConstants.NAVIGATION_MENU_IMAGE), "Could not find side menu home button");
        navigationMenuImage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.HELLO_LABEL)));
        Assert.assertTrue(isElementPresent(NConstants.HELLO_LABEL), "Could not find My Account in button");
        Assert.assertTrue(helloLabelSideMenu.getText().contains("Hello"), "Could not find My Account in button");

        super.goBack();
	}

	public void logout(){

        WebDriverWait wait = new WebDriverWait(aDriver, 30);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
//        Assert.assertTrue(isElementPresent(NConstants.NAVIGATION_MENU_IMAGE), "Could not find Menu button");
//        navigationMenuImage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
		Assert.assertTrue(isElementPresent(NConstants.NAVIGATION_MENU_IMAGE), "Could not find side menu home button");
        navigationMenuImage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ACCOUNT)));
        Assert.assertTrue(isElementPresent(NConstants.MY_ACCOUNT), "Could not find My Account in button");
        myAccount.click();

        super.swipeToElement(NConstants.MY_PROFILE);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_PROFILE)));
        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE), "Could not find my profile text");
        myProfile.click();

//        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_IMAGE), "Could not find user image");
//        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_NAME), "Could not find user name text");
//        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_EMAIL), "Could not find user email text");
//        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_PASSWORD), "Could not find user password text");
//        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_FRAGMENT_PASSWORD), "Could not find user framgement password text");

		super.scrollDownToElement(NConstants.MY_PROFILE_USER_SIGNOUT);

		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_SIGNOUT), "Could not sign out button");
        myProfileUserSignout.click();

    }

    public void signinWithFB(String user, String password) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(aDriver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.LOGIN_FB)));
        Assert.assertTrue(isElementPresent(NConstants.LOGIN_FB), "Could not find sign link");
        signinFB.click();

        super.allowAppPermission();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.FB_UESR)));
        Assert.assertTrue(isElementPresent(NConstants.FB_UESR), "Could not find FB login user");
        userFB.sendKeys(user);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.FB_PASS)));
        Assert.assertTrue(isElementPresent(NConstants.FB_PASS), "Could not find FB password box");
        passFB.sendKeys(password);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.FB_LOGIN_BTN)));
        Assert.assertTrue(isElementPresent(NConstants.FB_LOGIN_BTN), "Could not find phone field");
        loginBtnFB.click();
//        aDriver.hideKeyboard();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.FB_OK_BTN)));
        Assert.assertTrue(isElementPresent(NConstants.FB_OK_BTN), "Could not find ok button");
        okFB.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
        Assert.assertTrue(isElementPresent(NConstants.NAVIGATION_MENU_IMAGE), "Could not find navigation meny icon");


    }

    public void signinWithGoogle(String user, String password) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(aDriver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.LOGIN_GOOGLE)));
        Assert.assertTrue(isElementPresent(NConstants.LOGIN_GOOGLE), "Could not find sign link");
        signinGoogle.click();

        super.allowAppPermission();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.GOOGLE_USER)));
        Assert.assertTrue(isElementPresent(NConstants.GOOGLE_USER), "Could not find Google login user");
        userGoogle.sendKeys(user);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.GOOGLE_PASS)));
        Assert.assertTrue(isElementPresent(NConstants.GOOGLE_PASS), "Could not find Google password box");
        passGoogle.sendKeys(password);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.GOOGLE_NEXT)));
        Assert.assertTrue(isElementPresent(NConstants.GOOGLE_NEXT), "Could not find Next button");
        btnNext.click();
//        aDriver.hideKeyboard();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.GOOGLE_ACCEPT)));
        Assert.assertTrue(isElementPresent(NConstants.GOOGLE_ACCEPT), "Could not find accept button");
        btnAccept.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.GOOGLE_NEXT2)));
        Assert.assertTrue(isElementPresent(NConstants.GOOGLE_NEXT2), "Could not find Next button");
        btnNext2.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)));
        Assert.assertTrue(isElementPresent(NConstants.NAVIGATION_MENU_IMAGE), "Could not find navigation meny icon");


    }


}
