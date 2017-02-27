package com.noon.mobileapp.pages;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import com.thoughtworks.selenium.condition.ConditionRunner.Context;


public class ProductPage extends BasePage {

	public ProductPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver, test);
	}

	@FindBy(xpath = NConstants.ADD_TO_CART)
	public AndroidElement addToCart;

	@FindBy(xpath = NConstants.CART_ICON)
	public AndroidElement cartIcon;

	public void addProductToCart(){

        WebDriverWait wait = new WebDriverWait(aDriver, 20);

        scrollToElement(NConstants.ADD_TO_CART,"down");
        wait = new WebDriverWait(aDriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADD_TO_CART)));
        addToCart.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CART_ICON)));
        cartIcon.click();


    }

}