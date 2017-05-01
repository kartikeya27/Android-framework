package com.noon.mobileapp.pages;

import com.noon.mobileapp.util.Utils;
import org.apache.commons.lang3.ArrayUtils;
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
import services.OTPExtractionService;

import java.sql.Timestamp;

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

    @FindBy(xpath=NConstants.USE_EMAIL)
    public AndroidElement useEmail;
	
	@FindBy(xpath=NConstants.PASSWORD_VIEW_IMAGE)
	public AndroidElement passwordViewImage;
	
	@FindBy(xpath=NConstants.REGISTER_PASSWORD)
	public AndroidElement registerPassword;

    @FindBy(xpath=NConstants.SIGN_IN_MAIN)
    public AndroidElement signinMain;

    @FindBy(xpath=NConstants.REGISTER_BUTTON)
    public AndroidElement registerBtn;

    // OTP
    @FindBy(xpath=NConstants.OTP_LABEL)
    public AndroidElement otpLabel;

    @FindBy(xpath=NConstants.OTP_DIGIT_INPUT1)
    public AndroidElement otpDigit1;

   @FindBy(xpath=NConstants.OTP_DIGIT_INPUT2)
    public AndroidElement otpDigit2;

   @FindBy(xpath=NConstants.OTP_DIGIT_INPUT3)
    public AndroidElement otpDigit3;

   @FindBy(xpath=NConstants.OTP_DIGIT_INPUT4)
    public AndroidElement otpDigit4;

    @FindBy(xpath = NConstants.CART_ICON)
    public AndroidElement cartIcon;

    public void registerTest(String email) {

		test.log(LogStatus.INFO, "Launch Android Application - ");
		WebDriverWait wait = new WebDriverWait(aDriver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_MAIN)));
		Assert.assertTrue(isElementPresent(NConstants.SIGN_IN_MAIN), "Could not find sign in link");
		signinMain.click();

		super.allowAppPermission();
		
		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.REGISTER_TAB)));
		Assert.assertTrue(isElementPresent(NConstants.REGISTER_TAB), "Could not find registration tab");
		registerTab.click();
		
		Assert.assertTrue(isElementPresent(NConstants.REGISTER_TAB), "Could not find registration tab");
		//Assert.assertTrue(isElementPresent(NConstants.REGISTER_WITH), "Could not find registration with text");
		Assert.assertTrue(isElementPresent(NConstants.GOOGLE_BUTTON), "Could not google button");
		Assert.assertTrue(isElementPresent(NConstants.FACEBOOK_BUTTON), "Could not find facebook button");
		Assert.assertTrue(isElementPresent(NConstants.TWITTER_BUTTON), "Could not find twitter button");
		Assert.assertTrue(isElementPresent(NConstants.REGISTER_NAME), "Could not find registration name field");
//		Assert.assertTrue(isElementPresent(NConstants.REGISTER_EMAIL), "Could not find registration email address field");
		Assert.assertTrue(isElementPresent(NConstants.USE_EMAIL), "Could not find use email link");
		Assert.assertTrue(isElementPresent(NConstants.PASSWORD_VIEW_IMAGE), "Could not find password view image");
		Assert.assertTrue(isElementPresent(NConstants.REGISTER_PASSWORD), "Could not find create password field");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String timestampedEmail = "noonnoontest+" + String.valueOf(timestamp.getTime()) + "@gmail.com";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.USE_EMAIL)));
        Assert.assertTrue(isElementPresent(NConstants.USE_EMAIL), "Could not find use email in link");
        useEmail.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.REGISTER_NAME)));
        Assert.assertTrue(isElementPresent(NConstants.REGISTER_NAME), "Could not find name input");
        registerName.sendKeys("Test User");
        try {
            aDriver.hideKeyboard();
        } catch (Exception e) {
        }


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.REGISTER_EMAIL)));
        Assert.assertTrue(isElementPresent(NConstants.REGISTER_EMAIL), "Could not find email input");
        registerEmail.sendKeys(timestampedEmail);
        try {
            aDriver.hideKeyboard();
        } catch (Exception e) {
        }


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.REGISTER_PASSWORD)));
        Assert.assertTrue(isElementPresent(NConstants.REGISTER_PASSWORD), "Could not find password input");
        registerPassword.sendKeys("Test1234");
        try {
            aDriver.hideKeyboard();
        } catch (Exception e) {
        }

        super.scrollToElement(NConstants.REGISTER_BUTTON,DOWN);
		Assert.assertTrue(isElementPresent(NConstants.REGISTER_BUTTON), "Could not find registration button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.REGISTER_BUTTON)));
        registerBtn.click();

        Utils.waitABit(15000);

        OTPExtractionService otpExtractionService = new OTPExtractionService(email);
        String verificationCode = otpExtractionService.getVerificationCodeRegistration();

        //enter OTP data
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.OTP_LABEL)));
        Assert.assertTrue(isElementPresent(NConstants.OTP_LABEL), "Could not find OTP label button");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.OTP_DIGIT_INPUT1)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.OTP_DIGIT_INPUT2)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.OTP_DIGIT_INPUT3)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.OTP_DIGIT_INPUT4)));

        char[] otpCharArray = verificationCode.toCharArray();
        Character[] charObjectArray = ArrayUtils.toObject(otpCharArray);
        otpDigit1.sendKeys(charObjectArray[0].toString());
        otpDigit2.sendKeys(charObjectArray[1].toString());
        otpDigit3.sendKeys(charObjectArray[2].toString());
        otpDigit4.sendKeys(charObjectArray[3].toString());

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CART_ICON)));
//        Assert.assertTrue(isElementPresent(NConstants.CART_ICON), "OTP issue ");

        Utils.waitABit(1000);
    }

}
