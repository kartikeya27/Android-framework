package com.noon.mobileapp.pages;

import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//It is encapsulated class inside all pages object contain another object
public class TopMenuPage {
	public AndroidDriver<AndroidElement> aDriver;
	public ExtentTest test;
	
	public TopMenuPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		this.aDriver = aDriver;
		this.test = test;
	}

    @FindBy(xpath = NConstants.TOOLBAR_LOGO)
    public AndroidElement toolbarLogo;

	@FindBy(xpath = NConstants.CART_ICON)
    public AndroidElement cartIcon;

	public void gotoCart() {

        WebDriverWait wait = new WebDriverWait(aDriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CART_ICON)));
        cartIcon.click();
		
	}

	public void gotoHome() {

        WebDriverWait wait = new WebDriverWait(aDriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TOOLBAR_LOGO)));
        toolbarLogo.click();


	}
	
	public void search() {
		
	}
	
}
