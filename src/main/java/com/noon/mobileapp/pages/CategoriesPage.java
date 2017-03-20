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

public class CategoriesPage extends BasePage {
	
	public CategoriesPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver,test);
	}

    @FindBy(xpath= NConstants.NAVIGATION_MENU_IMAGE)
    public AndroidElement navigationMenuImage;

    @FindBy(xpath=NConstants.MENU_HOME)
    public AndroidElement navigationMenuHome;

    @FindBy(xpath=NConstants.SHOP_BY_CATEGORY)
    public WebElement shopByCategory;

    @FindBy(xpath= NConstants.ALL_CATEGORIES)
    public AndroidElement allCategories;

    @FindBy(xpath=NConstants.FASHION_CAT_LINK)
    public AndroidElement fashionCatLink;

    @FindBy(xpath=NConstants.TOYS_CAT_LINK)
    public WebElement toysCatLInk;

    @FindBy(xpath= NConstants.BABY_CAT_LINK)
    public AndroidElement BabyCatLink;

    @FindBy(xpath=NConstants.BOOKS_CAT_LINK)
    public AndroidElement booksCatLInk;

    @FindBy(xpath=NConstants.HEALTH_CAT_LINK)
    public WebElement healthCatLInk;

    @FindBy(xpath=NConstants.HOME_CAT_LINK)
    public WebElement homeCatLink;

    @FindBy(xpath=NConstants.SPORTS_CAT_LINK)
    public WebElement sportsCatLink;

    @FindBy(xpath=NConstants.ELECTRONICS_CAT_LINK)
    public WebElement electronicsCatLink;

	public void verifyMenuMainCategories() {

        WebDriverWait wait = new WebDriverWait(aDriver, 30);

//        scrollToElement(NConstants.ALL_CATEGORIES, DOWN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ALL_CATEGORIES)));
        Assert.assertTrue(isElementPresent(NConstants.ALL_CATEGORIES), "Could not find Categories label");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.FASHION_CAT_LINK)));
        Assert.assertTrue(isElementPresent(NConstants.FASHION_CAT_LINK), "Could not find Fashion link");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ELECTRONICS_CAT_LINK)));
        Assert.assertTrue(isElementPresent(NConstants.ELECTRONICS_CAT_LINK), "Could not find Electronics link");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TOYS_CAT_LINK)));
        Assert.assertTrue(isElementPresent(NConstants.TOYS_CAT_LINK), "Could not find Toys link");

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.BABY_CAT_LINK)));
       Assert.assertTrue(isElementPresent(NConstants.BABY_CAT_LINK), "Could not find Baby link");

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.BOOKS_CAT_LINK)));
       Assert.assertTrue(isElementPresent(NConstants.BOOKS_CAT_LINK), "Could not find Books, Music, & Movies link");

        scrollToElement(NConstants.HEALTH_CAT_LINK, DOWN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.HEALTH_CAT_LINK)));
       Assert.assertTrue(isElementPresent(NConstants.HEALTH_CAT_LINK), "Could not find Health & Beauty link");

        scrollToElement(NConstants.HOME_CAT_LINK, DOWN);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.HOME_CAT_LINK)));
       Assert.assertTrue(isElementPresent(NConstants.HOME_CAT_LINK), "Could not find Hpme link");

        scrollToElement(NConstants.SPORTS_CAT_LINK, DOWN);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SPORTS_CAT_LINK)));
       Assert.assertTrue(isElementPresent(NConstants.SPORTS_CAT_LINK), "Could not find Sports link");

	}

	public void goToCategoryPage(String categoryCode){

        WebDriverWait wait = new WebDriverWait(aDriver, 30);

        scrollToElement(categoryCode, DOWN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(categoryCode)));
        Assert.assertTrue(isElementPresent(categoryCode), "Could not find category link");
        aDriver.findElement(By.xpath(categoryCode)).click();

    }

}
