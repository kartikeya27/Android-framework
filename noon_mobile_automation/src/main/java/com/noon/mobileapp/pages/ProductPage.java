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

	@FindBy(xpath = NConstants.FREQUENTLY_BOUGHT_TOGETHER)
	public AndroidElement boughtTogether;

	@FindBy(xpath = NConstants.PRODUCT_DESCRIPTION)
	public AndroidElement description;


	@FindBy(xpath = NConstants.PRODUCT_SPECIFICATIONS)
	public AndroidElement specifications;

	@FindBy(xpath = NConstants.PRODUCT_RELATED_VIDEOS)
	public AndroidElement videos;

	@FindBy(xpath = NConstants.RECOMMENDED_PRODUCTS)
	public AndroidElement recommendedProducts;

	@FindBy(xpath = NConstants.PRODUCT_SIZE_GUIDE)
	public AndroidElement sizeGuide;

	@FindBy(xpath = NConstants.BUY_NOW)
	public AndroidElement buyNow;

    @FindBy(xpath = NConstants.MORE_OFFERS)
    public AndroidElement moreOffers;


    @FindBy(xpath = NConstants.SEE_ALL)
    public AndroidElement seeAll;


	public void addProductToCart(){

        WebDriverWait wait = new WebDriverWait(aDriver, 10);

        scrollToElement(NConstants.ADD_TO_CART,"down");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADD_TO_CART)));
        addToCart.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CART_ICON)));
        cartIcon.click();


    }

    public void verifyProductPage(String productName){
        WebDriverWait wait = new WebDriverWait(aDriver, 10);
        String title = ".//*[contains(@text,'" + productName + "')]";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(title)));

        scrollToElement(NConstants.BUY_NOW,"down");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.BUY_NOW)));

        scrollToElement(NConstants.ADD_TO_CART,"down");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADD_TO_CART)));

//        scrollToElement(NConstants.MORE_OFFERS,"down");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MORE_OFFERS)));

        scrollToElement(NConstants.PRODUCT_DESCRIPTION,"down");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PRODUCT_DESCRIPTION)));

        scrollToElement(NConstants.PRODUCT_SPECIFICATIONS,"down");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PRODUCT_SPECIFICATIONS)));

        scrollToElement(NConstants.FREQUENTLY_BOUGHT_TOGETHER,"down");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.FREQUENTLY_BOUGHT_TOGETHER)));

        scrollToElement(NConstants.PRODUCT_RELATED_VIDEOS,"down");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PRODUCT_RELATED_VIDEOS)));

       scrollToElement(NConstants.RECOMMENDED_PRODUCTS,"down");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.RECOMMENDED_PRODUCTS)));

       scrollToElement(NConstants.SEE_ALL,"down");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SEE_ALL)));

//       scrollUpToElement(title);
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(title)));




    }

}