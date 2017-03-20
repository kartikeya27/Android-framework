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

public class BooksPage extends BasePage {

	public BooksPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver,test);
	}

    @FindBy(xpath= NConstants.BOOKS_TEXT)
    public AndroidElement booksPageLabel;

	public void verifyBooksCategoryPage() {

        WebDriverWait wait = new WebDriverWait(aDriver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.BOOKS_TEXT)));
        Assert.assertTrue(isElementPresent(NConstants.BOOKS_TEXT), "Could not find Books, Music & Movies label");

	}

}
