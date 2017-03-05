package com.noon.mobileapp.pages;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddressPage extends BasePage {

	public AddressPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver, test);
	}
	
	@FindBy(xpath=NConstants.ADDRESS_BOOK)
	public AndroidElement addressBook;

	@FindBy(xpath=NConstants.MY_ACCOUNT)
	public AndroidElement myAccount;

	@FindBy(xpath=NConstants.ADD_FIRST_ADDRESS)
	public AndroidElement addFirstAddress;

	@FindBy(xpath=NConstants.ADD_ANOTHER_ADDRESS)
	public AndroidElement addAnotherAddress;

	@FindBy(xpath=NConstants.MAP_DONE)
	public AndroidElement mapDone;

	@FindBy(xpath=NConstants.MAP_CANCEL)
	public AndroidElement mapCancel;

	@FindBy(xpath=NConstants.LOCATE_SEARCHING_PROGRESS)
	public AndroidElement locateSearchiingInProgress;

    @FindBy(xpath=NConstants.LOCATE_MY_LOCATION)
	public AndroidElement locateMe;

    @FindBy(xpath=NConstants.ALMOST_DONE_ADDRESS)
	public AndroidElement almostDoneLabel;

    @FindBy(xpath=NConstants.DELIVERY_ADDRESS_LABEL)
	public AndroidElement deliveryAddresLabel;

//	Add Address section

    @FindBy(xpath=NConstants.ADDRESS_COUNTRY)
    public AndroidElement addressCountry;

    @FindBy(xpath=NConstants.ADDRESS_CITY)
    public AndroidElement addressCity;

    @FindBy(xpath=NConstants.ADDRESS_BUILDING)
    public AndroidElement addressBuilding;

    @FindBy(xpath=NConstants.ADDRESS_FLAT_NO)
    public AndroidElement addressFlat;

    @FindBy(xpath=NConstants.ADDRESS_FLOOR_NO)
    public AndroidElement addressFloor;

    @FindBy(xpath=NConstants.ADDRESS_AREA)
    public AndroidElement addressArea;

    @FindBy(xpath=NConstants.ADDRESS_STREEET)
    public AndroidElement addressStreet;

    @FindBy(xpath=NConstants.ADDRESS_DETAILS)
    public AndroidElement addressDetails;

    @FindBy(xpath=NConstants.ADDRESS_BUSINESS_CHECKBOX)
    public AndroidElement addressBusinessCheckbox;

    @FindBy(xpath=NConstants.ADDRESS_DEFAULT_CHECKBOX)
    public AndroidElement addressDefaultCheckbox;

    @FindBy(xpath=NConstants.ADDRESS_NAME)
    public AndroidElement addressName;

    @FindBy(xpath=NConstants.ADDRESS_PHONE)
    public AndroidElement addressPhone;

    @FindBy(xpath=NConstants.ADDRESS_SAVE)
    public AndroidElement addressSave;


	public void addAddress(String userName, String userPassword) throws InterruptedException {

//		Current Location inside Address Book main section

		


	}

	public void goToAddressBook(){
		WebDriverWait wait = new WebDriverWait(aDriver, 30);

		//	Current location is in My Accountview

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ACCOUNT)));
		Assert.assertTrue(isElementPresent(NConstants.MY_ACCOUNT), "Could not find My Account in button");
		myAccount.click();

		for(int i=0;i<8;i++) {
			Dimension size = aDriver.manage().window().getSize();
			int startx = (int) (size.width * 0.70);
			int endx = (int) (size.width * 0.30);
			int starty = size.height / 2;
			aDriver.swipe(startx, starty, endx, starty, 2000);
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADDRESS_BOOK)));
		Assert.assertTrue(isElementPresent(NConstants.ADDRESS_BOOK), "Could not find Address Book");
		addressBook.click();

	}

	public void addAnotherAddress(){
	    // Current location Address Book main view
        WebDriverWait wait = new WebDriverWait(aDriver, 30);

        // scroll to add another address button
        scrollToElement(NConstants.ADD_ANOTHER_ADDRESS, DOWN);

        //Add another address button
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADD_ANOTHER_ADDRESS)));
        Assert.assertTrue(isElementPresent(NConstants.ADD_ANOTHER_ADDRESS), "Could not find Another Address button");
        addAnotherAddress.click();


    }

    public void addFirstAddress(){
        // Current location Address Book main view
        WebDriverWait wait = new WebDriverWait(aDriver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADD_FIRST_ADDRESS)));
        Assert.assertTrue(isElementPresent(NConstants.ADD_FIRST_ADDRESS), "Could not find First Address button");
        addFirstAddress.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MAP_CANCEL)));
        Assert.assertTrue(isElementPresent(NConstants.MAP_CANCEL), "Could not find Map Cancell Location button");

    }

    public void addAddressSteps(String building, String flatNo, String floorNo, String street, String phone){
        // Current location Address Form
        WebDriverWait wait = new WebDriverWait(aDriver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MAP_CANCEL)));
        Assert.assertTrue(isElementPresent(NConstants.MAP_CANCEL), "Could not find Map Cancell Location button");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.LOCATE_SEARCHING_PROGRESS)));
        Assert.assertTrue(isElementPresent(NConstants.LOCATE_SEARCHING_PROGRESS), "Could not find Map Locating");
        locateSearchiingInProgress.click();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.LOCATE_MY_LOCATION)));
//        Assert.assertTrue(isElementPresent(NConstants.LOCATE_MY_LOCATION), "Could not find locate me icon");
//        locateMe.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MAP_DONE)));
        Assert.assertTrue(isElementPresent(NConstants.MAP_DONE), "Could not find Map Locating");
        mapDone.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ALMOST_DONE_ADDRESS)));
        Assert.assertTrue(isElementPresent(NConstants.ALMOST_DONE_ADDRESS), "Could not find Almost Done label");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.DELIVERY_ADDRESS_LABEL)));
        Assert.assertTrue(isElementPresent(NConstants.DELIVERY_ADDRESS_LABEL), "Could not find delivery address label");

        scrollToElement(NConstants.ADDRESS_BUILDING, DOWN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADDRESS_BUILDING)));
        addressBuilding.sendKeys(building);

        scrollToElement(NConstants.ADDRESS_FLAT_NO, DOWN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADDRESS_FLAT_NO)));
        addressFlat.sendKeys(flatNo);

        scrollToElement(NConstants.ADDRESS_FLOOR_NO, DOWN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADDRESS_FLOOR_NO)));
        addressFloor.sendKeys(floorNo);

        scrollToElement(NConstants.ADDRESS_STREEET, DOWN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADDRESS_STREEET)));
        addressStreet.sendKeys(street);

        scrollToElement(NConstants.ADDRESS_PHONE, DOWN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADDRESS_PHONE)));
        addressPhone.sendKeys(phone);

        scrollToElement(NConstants.ADDRESS_SAVE, DOWN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ADDRESS_SAVE)));
        addressSave.click();

    }

}
