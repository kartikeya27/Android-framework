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

public class MyWalletPage extends BasePage {

	public MyWalletPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver, test);
	}
	
	@FindBy(xpath=NConstants.NAVIGATION_MENU_IMAGE)
	public AndroidElement navigationMenuImage;

	@FindBy(xpath=NConstants.TRANSACTIONS_WALLET)
	public AndroidElement transactions;

    @FindBy(xpath=NConstants.SAVED_CARDS_WALLET)
	public AndroidElement savedCards;

    @FindBy(xpath=NConstants.BALANCE_WALLET)
	public AndroidElement balance;

    @FindBy(xpath=NConstants.ADD_CARD_BTN_WALLET)
	public AndroidElement addNewCard;

    @FindBy(xpath=NConstants.DELETE_FIRST_CARD)
	public AndroidElement deleteLastCard;

   @FindBy(xpath=NConstants.CARD_REMOVE_CONFIRMATION_BTN_YES)
	public AndroidElement confirmRemove;


    public void removeLastCard(){
        WebDriverWait wait = new WebDriverWait(aDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.DELETE_FIRST_CARD)));
        Assert.assertTrue(isElementPresent(NConstants.DELETE_FIRST_CARD), "Could not find delete card button");
        deleteLastCard.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CARD_REMOVE_CONFIRMATION_MSG)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CARD_REMOVE_CONFIRMATION_BTN_YES)));
        confirmRemove.click();

    }

    public void waitForPageToLoad(){

        WebDriverWait wait = new WebDriverWait(aDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.TRANSACTIONS_WALLET)));
        Assert.assertTrue(isElementPresent(NConstants.TRANSACTIONS_WALLET), "Could not find transactionst tab");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SAVED_CARDS_WALLET)));
        Assert.assertTrue(isElementPresent(NConstants.SAVED_CARDS_WALLET), "Could not find saved cards tab");

    }

    public void goToSavedCards(){
        WebDriverWait wait = new WebDriverWait(aDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SAVED_CARDS_WALLET)));
        Assert.assertTrue(isElementPresent(NConstants.SAVED_CARDS_WALLET), "Could not find saved cards tab");
        savedCards.click();
    }


    public void goToAddNewCard(){
        WebDriverWait wait = new WebDriverWait(aDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADD_CARD_BTN_WALLET)));
        Assert.assertTrue(isElementPresent(NConstants.ADD_CARD_BTN_WALLET), "Could not find add card button");
        addNewCard.click();
    }

	
}
