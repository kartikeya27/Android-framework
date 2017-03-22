package com.noon.mobileapp.pages;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage extends BasePage {

	public ProfilePage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver, test);
	}
	
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

      @FindBy(xpath=NConstants.MY_PROFILE_CONTINUE_SHOPPING)
    public AndroidElement continueShopping;

      String elemByText = "//android.widget.TextView[@text=\"%s\"]";

    public void goToProfilePage(){
        WebDriverWait wait = new WebDriverWait(aDriver, 30);
        super.swipeToElement(NConstants.MY_PROFILE);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_PROFILE)));
        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE), "Could not find my profile text");
        myProfile.click();
    }

    public void verifyProfilePage(String email, String name){
        WebDriverWait wait = new WebDriverWait(aDriver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_PROFILE_USER_SIGNOUT)));
        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_SIGNOUT), "Could not find sign out button");
        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_CONTINUE_SHOPPING), "Could not find continue shopping button");
        Assert.assertTrue(isElementPresent(String.format(elemByText,email)), "Could not find user email");
        Assert.assertTrue(isElementPresent(String.format(elemByText,name)), "Could not find user name");

    }


	public void logout(){

        WebDriverWait wait = new WebDriverWait(aDriver, 30);
		super.scrollDownToElement(NConstants.MY_PROFILE_USER_SIGNOUT);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_PROFILE_USER_SIGNOUT)));
        Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_SIGNOUT), "Could not sign out button");
        myProfileUserSignout.click();

    }
	
}
