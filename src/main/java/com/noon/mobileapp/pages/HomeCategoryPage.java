package com.noon.mobileapp.pages;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomeCategoryPage extends BasePage {

	public HomeCategoryPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver,test);
	}

    @FindBy(xpath= NConstants.HOME_TEXT)
    public AndroidElement homePageLabel;

	public void verifyHomeCategoryPage() {

        WebDriverWait wait = new WebDriverWait(aDriver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.HOME_TEXT)));
        Assert.assertTrue(isElementPresent(NConstants.HOME_TEXT), "Could not find Home label");

	}

}
