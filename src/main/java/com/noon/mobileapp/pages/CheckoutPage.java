package com.noon.mobileapp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import com.thoughtworks.selenium.condition.ConditionRunner.Context;
import com.sun.glass.events.KeyEvent;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;




public class CheckoutPage extends BasePage {
	
	public CheckoutPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver, test);
		
	}

    String SELECT_DELIVERY_MSG = "//*[contains(@text,'Select your delivery method')]";
    String DEFAULT_ADDRESS = "//*[contains(@text,'Default')]";
    String PAYMENT_PAY_WITH_MSG = "//*[contains(@text,'Pay with')]";
    String PAY_ON_DELIVERY = "//*[contains(@text,'Pay on delivery')]";
    String PLACE_ORDER_BTN = "//*[contains(@text,\"Place Order\")]";
    String SUBTOTAL = "//*[contains(@resource-id,\"com.noon:id/checkout_subtotal_value\")]";
    String GRAND_TOTAL = "//*[contains(@resource-id,\"com.noon:id/checkout_grandtotal\")]";


    @FindBy(xpath = NConstants.SELECT_DELIVERY_MSG)
    public AndroidElement deliveryMsg;

    @FindBy(xpath = NConstants.DEFAULT_ADDRESS)
    public AndroidElement defaultAddress;

    @FindBy(xpath = NConstants.PAYMENT_PAY_WITH_MSG)
    public AndroidElement paymentMsg;

    @FindBy(xpath = NConstants.PAY_ON_DELIVERY)
    public AndroidElement payOnDeliveryOption;

    @FindBy(xpath = NConstants.PAY_WITH_CARD)
    public AndroidElement payWithCardOption;

    @FindBy(xpath = NConstants.PLACE_ORDER_BTN)
    public AndroidElement placeOrderBtn;

    @FindBy(xpath = NConstants.SUBTOTAL)
    public AndroidElement subtotal;

    @FindBy(xpath = NConstants.GRAND_TOTAL)
    public AndroidElement grandTotal;

   @FindBy(xpath = NConstants.ADD_NEW_CARD_PAYMENT)
    public AndroidElement addNewCardPayment;

   @FindBy(xpath = NConstants.PAY_WITH_CARD)
    public AndroidElement payWithCard;

  @FindBy(xpath = NConstants.REVIEW)
    public AndroidElement reviewLabel;

    public void checkoutDefaultAddress(){

        WebDriverWait wait = new WebDriverWait(aDriver, 20);

        scrollToElement(NConstants.SELECT_DELIVERY_MSG,"down");
        wait = new WebDriverWait(aDriver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.DEFAULT_ADDRESS)));
        defaultAddress.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PAYMENT_PAY_WITH_MSG)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PAY_ON_DELIVERY)));
    }

    public void checkoutCod(){

        WebDriverWait wait = new WebDriverWait(aDriver, 20);

//        scrollToElement(NConstants.SELECT_DELIVERY_MSG,"down");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.DEFAULT_ADDRESS)));
//        defaultAddress.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PAYMENT_PAY_WITH_MSG)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PAY_ON_DELIVERY)));
        payOnDeliveryOption.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SUBTOTAL)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.GRAND_TOTAL)));


    }

    public void checkoutCard(){

        WebDriverWait wait = new WebDriverWait(aDriver, 20);

//        scrollToElement(NConstants.SELECT_DELIVERY_MSG,"down");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.DEFAULT_ADDRESS)));
//        defaultAddress.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PAYMENT_PAY_WITH_MSG)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PAY_ON_DELIVERY)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PAY_WITH_CARD)));
        // choose existing card
        payWithCard.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SUBTOTAL)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.GRAND_TOTAL)));

    }

    public void checkoutPickDefaultAddress(){

        WebDriverWait wait = new WebDriverWait(aDriver, 20);

        scrollToElement(NConstants.SELECT_DELIVERY_MSG,"down");
        wait = new WebDriverWait(aDriver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.DEFAULT_ADDRESS)));
        defaultAddress.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PAYMENT_PAY_WITH_MSG)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PAY_ON_DELIVERY)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADD_NEW_CARD_PAYMENT)));

    }

    public void checkoutPickAddNewCC(){

        WebDriverWait wait = new WebDriverWait(aDriver, 20);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NConstants.ADD_NEW_CARD_PAYMENT)));
        addNewCardPayment.click();

    }

    public void verifyPaymentCheckout(){
        WebDriverWait wait = new WebDriverWait(aDriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PAYMENT_PAY_WITH_MSG)));
    }



}
