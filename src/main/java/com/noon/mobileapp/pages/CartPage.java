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

//import com.thoughtworks.selenium.condition.ConditionRunner.Context;


public class CartPage extends BasePage {

	public CartPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver, test);
	}

	@FindBy(xpath = NConstants.ADD_TO_CART)
	public AndroidElement addToCart;

	@FindBy(xpath = NConstants.CART_ICON)
	public AndroidElement cartIcon;

    @FindBy(xpath = NConstants.INCREASE_QUANTITY_IN_CART)
	public AndroidElement increaseQuantity;

    @FindBy(xpath = NConstants.DECREASE_QUANTITY_IN_CART)
    public AndroidElement decreaseQuantity;

    @FindBy(xpath = NConstants.PRODUCT_QUANTITY)
    public AndroidElement productQuantity;

    @FindBy(xpath = NConstants.REMOVE_FROM_CART)
    public AndroidElement removeProduct;

   @FindBy(xpath = NConstants.SECURE_CHECKOUT)
    public AndroidElement secureCheckout;

    @FindBy(xpath = NConstants.CART_EMPTY_LABEL)
    public AndroidElement cartEmplyLabel;



	public void removeProductFromCart(String productName){

        WebDriverWait wait;

        scrollToElement(NConstants.ADD_TO_CART,"down");
        wait = new WebDriverWait(aDriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADD_TO_CART)));
        addToCart.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CART_ICON)));
        cartIcon.click();


    }

    public void goToCart(){
        WebDriverWait wait = new WebDriverWait(aDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CART_ICON)));
        cartIcon.click();
    }

    public void increase(){
        WebDriverWait wait;

        scrollToElement(NConstants.INCREASE_QUANTITY_IN_CART,"down");
        wait = new WebDriverWait(aDriver, 10);
        int initialQuantity = 0;
        int finalQuantity = 0;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PRODUCT_QUANTITY)));
        initialQuantity = Integer.parseInt(productQuantity.getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.INCREASE_QUANTITY_IN_CART)));
        increaseQuantity.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PRODUCT_QUANTITY)));
        finalQuantity = Integer.parseInt(productQuantity.getText());

        Assert.assertEquals(finalQuantity,initialQuantity+1,"Item quantity was not increased");
    }

    public void decrease(){
        WebDriverWait wait = new WebDriverWait(aDriver, 20);

        scrollToElement(NConstants.INCREASE_QUANTITY_IN_CART,"down");
        wait = new WebDriverWait(aDriver, 10);
        int initialQuantity = 0;
        int finalQuantity = 0;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PRODUCT_QUANTITY)));
        initialQuantity = Integer.parseInt(productQuantity.getText());
        Assert.assertTrue(initialQuantity > 1, "Cannot decrease, we only have " + initialQuantity + " item");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.DECREASE_QUANTITY_IN_CART)));
        decreaseQuantity.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PRODUCT_QUANTITY)));
        finalQuantity = Integer.parseInt(productQuantity.getText());

        Assert.assertEquals(finalQuantity,initialQuantity-1,"Item quantity was not decreased");
    }

    public void removeFromCart(){
        WebDriverWait wait = new WebDriverWait(aDriver, 20);

        scrollToElement(NConstants.REMOVE_FROM_CART,"down");
        wait = new WebDriverWait(aDriver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.REMOVE_FROM_CART)));
        removeProduct.click();

    }

    public void checkout(){
        WebDriverWait wait = new WebDriverWait(aDriver, 20);

        scrollToElement(NConstants.SECURE_CHECKOUT,"down");
        wait = new WebDriverWait(aDriver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SECURE_CHECKOUT)));
        secureCheckout.click();

    }

    public void verifyCartIsEmpty(){
        WebDriverWait wait = new WebDriverWait(aDriver, 20);

//        scrollToElement(NConstants.SECURE_CHECKOUT,"down");
        wait = new WebDriverWait(aDriver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CART_EMPTY_LABEL)));

    }

}