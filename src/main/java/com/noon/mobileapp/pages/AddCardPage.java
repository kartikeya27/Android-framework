package com.noon.mobileapp.pages;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.noon.mobileapp.util.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCardPage extends BasePage {

	public AddCardPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver, test);
	}
	
	@FindBy(xpath=NConstants.CARD_NNUMBER)
	public AndroidElement cardNumber;

	@FindBy(xpath=NConstants.NAME_ON_CARD)
	public AndroidElement cardName;

	@FindBy(xpath=NConstants.MONTH_CARD)
	public AndroidElement cardMonth;

	@FindBy(xpath=NConstants.YEAR_CARD)
	public AndroidElement cardYear;

	@FindBy(xpath=NConstants.SAVE_CARD)
	public AndroidElement cardSave;

	@FindBy(xpath=NConstants.MAKE_DEFAULT_CARD)
	public AndroidElement cardMakeDefault;



    public void waitForPageToLoad() {

        WebDriverWait wait = new WebDriverWait(aDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADD_NEW_CARD_LABEL)));
        Assert.assertTrue(isElementPresent(NConstants.ADD_NEW_CARD_LABEL), "Could not find add new card label");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAME_ON_CARD)));
        Assert.assertTrue(isElementPresent(NConstants.NAME_ON_CARD), "Could not find name on card input");
    }

    public void addNewCardData(String name, String cn, String year, String month, boolean def){
        WebDriverWait wait = new WebDriverWait(aDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.NAME_ON_CARD)));
        Assert.assertTrue(isElementPresent(NConstants.NAME_ON_CARD), "Could not find name on card input");
        cardName.sendKeys(name);
        try {
            aDriver.hideKeyboard();
        } catch (Exception e) {
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CARD_NNUMBER)));
        Assert.assertTrue(isElementPresent(NConstants.CARD_NNUMBER), "Could not find CC number input");
        cardNumber.sendKeys(cn);
        try {
            aDriver.hideKeyboard();
        } catch (Exception e) {
        }

        //select expiry date
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MONTH_CARD)));
        Assert.assertTrue(isElementPresent(NConstants.MONTH_CARD), "Could not find month dropdown");
        cardMonth.click();
        selectCCExpiryOptionMonth(month);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.YEAR_CARD)));
        Assert.assertTrue(isElementPresent(NConstants.YEAR_CARD), "Could not find year dropdown");
        cardYear.click();
        selectCCExpiryOptionYear(year);

        if(def==true){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MAKE_DEFAULT_CARD)));
            Assert.assertTrue(isElementPresent(NConstants.MAKE_DEFAULT_CARD), "Could not find make default box");
            cardMakeDefault.click();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NConstants.SAVE_CARD)));
        Assert.assertTrue(isElementPresent(NConstants.SAVE_CARD), "Could not find save card btn");

//        Utils.waitABit(10000);
        cardSave.click();

//        Utils.waitABit(10000);

    }

    public void selectCCExpiryOptionMonth(String option){
        String loc = "//android.widget.TextView[@text=\"%s\"]";
        String optionLoc = String.format(loc,option) ;
        smallVerticalScrollDownUpperLeft();
        smallVerticalScrollDownUpperLeft();
//        scrollToElement(optionLoc, DOWN);

        aDriver.findElement(By.xpath(optionLoc)).click();

    }

    public void selectCCExpiryOptionYear(String option){
        String loc = "//android.widget.TextView[@text=\"%s\"]";
        String optionLoc = String.format(loc,option) ;
//        smallVerticalScrollDownUpperLeft();
//        scrollToElement(optionLoc, DOWN);

        aDriver.findElement(By.xpath(optionLoc)).click();

    }




}
