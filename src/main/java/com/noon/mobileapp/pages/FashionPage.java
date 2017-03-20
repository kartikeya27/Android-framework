package com.noon.mobileapp.pages;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FashionPage extends BasePage {

	public FashionPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver,test);
	}

    @FindBy(xpath= NConstants.FASHION_TEXT)
    public AndroidElement fashionPageLabel;

	public void verifyFashionCategoryPage() {

        WebDriverWait wait = new WebDriverWait(aDriver, 30);

//        scrollToElement(NConstants.ALL_CATEGORIES, DOWN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.FASHION_TEXT)));
        Assert.assertTrue(isElementPresent(NConstants.FASHION_TEXT), "Could not find Fashion label");

	}

}
