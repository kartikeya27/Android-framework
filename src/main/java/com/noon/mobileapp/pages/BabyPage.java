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

public class BabyPage extends BasePage {

	public BabyPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver,test);
	}

    @FindBy(xpath= NConstants.BABY_TEXT)
    public AndroidElement babyPageLabel;

	public void verifyBabyCategoryPage() {

        WebDriverWait wait = new WebDriverWait(aDriver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.BABY_TEXT)));
        Assert.assertTrue(isElementPresent(NConstants.BABY_TEXT), "Could not find Baby label");

	}

}
