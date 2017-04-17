package com.noon.mobileapp.pages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
//import com.thoughtworks.selenium.condition.ConditionRunner.Context;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class SearchPage extends BasePage {
	
	public SearchPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver, test);
	}
	
	@FindBy(xpath=NConstants.SIGNIN_CENTRAL_BUTTON)
	public AndroidElement signinCentalButton;
	
	@FindBy(xpath=NConstants.SIGN_IN_TAB)
	public AndroidElement signinTab;
	
	@FindBy(xpath=NConstants.EMAIL_LINK)
	public AndroidElement emailLink;
	
	@FindBy(xpath=NConstants.SIGNIN_EMAIL)
	public AndroidElement signinEmail;
	
	@FindBy(xpath=NConstants.SIGNIN_PASSWORD)
	public AndroidElement signinPassword;
	
	@FindBy(xpath=NConstants.SIGNIN_BUTTON)
	public AndroidElement signinButton;
	
	@FindBy(xpath=NConstants.MY_ACCOUNT)
	public AndroidElement myAccount;
	
	@FindBy(xpath=NConstants.NO_ORDERS)
	public AndroidElement noOrders;
	
	@FindBy(xpath=NConstants.SEARCH_TEXT_VIEW)
	public AndroidElement searchTextView;

	@FindBy(xpath=NConstants.SEARCH_EDIT_TEXT_VIEW)
	public AndroidElement searchEditTextView;
	
	@FindBy(xpath=NConstants.SEARCH_IMAGEVIEW)
	public AndroidElement searchImageview;
	
	@FindBy(xpath=NConstants.SEARCH_BAR_CONTAINER)
	public AndroidElement searchBarContainer;
	
	@FindBy(xpath=NConstants.ITEM_PRODUCT_TITILE)
	public AndroidElement itemProductTitle;
	
	@FindBy(xpath=NConstants.ITEM_IMAGE)
	public AndroidElement itemImage;
	
	@FindBy(xpath=NConstants.PRODUCT_PRICE)
	public AndroidElement productPrice;
	
	@FindBy(xpath=NConstants.NAVIGATION_MENU_IMAGE)
	public AndroidElement navigationMenuImage;
	
	@FindBy(xpath=NConstants.MY_PROFILE)
    public WebElement myProfile;
	
	@FindBy(xpath=NConstants.MY_PROFILE_USER_SIGNOUT)
    public WebElement myProfileUserSignout;
	
	@FindBy(xpath=NConstants.ITEM_PICKER_THUMB)
	public AndroidElement itemPickerThumb;
	
	@FindBy(xpath=NConstants.PICKABLE_ITEM_TITLE)
	public AndroidElement pickableItemTitle;
	
	@FindBy(xpath=NConstants.ROW_INFO_RADIO)
	public AndroidElement rowInfoRadio;
	
	@FindBy(xpath=NConstants.ITEM_PICKER_TEXT)
	public AndroidElement itemPickertext;
	
	@FindBy(xpath=NConstants.ITEM_DESCRIPTION)
	public AndroidElement itemDescription;
	
	@FindBy(xpath=NConstants.ITEM_ARROW)
	public AndroidElement itemArrow;
	
	
	@FindBy(xpath=NConstants.PRODUCT_CART)
	public AndroidElement productCart;
	
	@FindBy(xpath=NConstants.PRODUCT_MENU_CART)
	public AndroidElement productMenuCart;
	
	@FindBy(xpath=NConstants.CART_SINGLE_LABEL)
	public AndroidElement cartSingleLabel;
	
	@FindBy(xpath=NConstants.CART_ITEM_DELETE)
	public AndroidElement cartItemDelete;
	
	@FindBy(xpath=NConstants.CART_ITEM_DECREASE)
	public AndroidElement cartItemDecrease;
	
	@FindBy(xpath=NConstants.CART_ITEM_INCREASE)
	public AndroidElement cartItemIncrease;
	
	@FindBy(xpath=NConstants.CART_CHECKOUT_BUTTON)
	public AndroidElement cartCheckoutButton;
	
	@FindBy(xpath=NConstants.PICK_LOCATION)
	public AndroidElement pickLocation;
	
	@FindBy(xpath=NConstants.CHECKOUT_ADDRESS)
	public AndroidElement checkoutAddress;
	
	@FindBy(xpath=NConstants.CHECKOUT_ADDRESS1)
	public AndroidElement checkoutAddress1;
	
	@FindBy(xpath=NConstants.CHECKOUT_ADDRESS2)
	public AndroidElement checkoutAddress2;
	
	@FindBy(xpath=NConstants.CHECKOUT_ADDRESS_TYPE)
	public AndroidElement checkoutAddressType;
	
	@FindBy(xpath=NConstants.CHECKOUT_ADDRESS_NAME)
	public AndroidElement checkoutAddressName;
	
	@FindBy(xpath=NConstants.CHECKOUT_ADDRESS_SELECT)
	public AndroidElement checkoutAddressSelect;
	
	@FindBy(xpath=NConstants.CHECKOUT_PERSON_NAME)
	public AndroidElement checkoutPersonName;
	
	@FindBy(xpath=NConstants.CHECKOUT_PERSON_MOBILE)
	public AndroidElement checkoutPersonMobile;
	
	@FindBy(xpath=NConstants.CHECKOUT_PERSON_APARTMENT)
	public AndroidElement checkoutPersonApartment;
	
	@FindBy(xpath=NConstants.CHECKOUT_PERSON_FLOOR)
	public AndroidElement checkoutPersonFloor;
	
	@FindBy(xpath=NConstants.CHECKOUT_PERSON_BUILDING)
	public AndroidElement checkoutPersonBuilding;
	
	@FindBy(xpath=NConstants.CHECKOUT_PERSON_AREA_NAME)
	public AndroidElement checkoutPersonAreaName;
	
	@FindBy(xpath=NConstants.CHECKOUT_PERSON_CITY)
	public AndroidElement checkoutPersonCity;
	
	@FindBy(xpath=NConstants.CHECKOUT_PERSON_LANDMARK)
	public AndroidElement checkoutPersonLandmark;
	
	@FindBy(xpath=NConstants.CHECKOUT_PERSON_COUNTRY)
	public AndroidElement checkoutPersonCountry;
	
	@FindBy(xpath=NConstants.CHECKOUT_SAVE_ADDRESS)
	public AndroidElement checkoutSaveAddress;
	
	@FindBy(xpath=NConstants.SHIP_CHOOSE_ADDRESS)
	public AndroidElement shipChooseAddress;
	
	@FindBy(xpath=NConstants.SHIP_ADDRESS_ALERT_CANCEL)
	public AndroidElement shipAddressAlertCancel;
	
	@FindBy(xpath=NConstants.SHIP_INFO)
	public AndroidElement Shipinfo;
	
	@FindBy(xpath=NConstants.SHIP_INFO_IMAGE)
	public AndroidElement shipInfoImage;
	
	@FindBy(xpath=NConstants.SHIP_CONTINUE_BUTTON)
	public AndroidElement shipContinueButton;
	
	@FindBy(xpath=NConstants.PAYMENT_CARD_NUMBER)
	public AndroidElement paymentCardNumber;
	
	@FindBy(xpath=NConstants.PAYMENT_CARD_MONTH)
	public AndroidElement paymentCardMonth;
	
	@FindBy(xpath=NConstants.PAYMENT_CARD_YEAR)
	public AndroidElement paymentCardYear;
	
	@FindBy(xpath=NConstants.PAYMENT_CVV_CODE_NUMBER)
	public AndroidElement paymentCvvCodeNumber;
	
	@FindBy(xpath=NConstants.PAYMENT_CVV_CODE_INFO)
	public AndroidElement PaymentCvvCodeInfo;
	
	@FindBy(xpath=NConstants.PAYMENT_CVV_CODE_INFO_IMAGE)
	public AndroidElement PaymentCvvCodeInfoImage;
	
	@FindBy(xpath=NConstants.PAYMENT_CARD_SAVE)
	public AndroidElement paymentCardSave;
	
	@FindBy(xpath=NConstants.PAY_BUTTON)
	public AndroidElement payButton;
	
	public void search(String userName, String userPassword, String searchItem) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGNIN_CENTRAL_BUTTON)));
		signinCentalButton.click();

		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SIGN_IN_TAB)));
		signinTab.click();
		emailLink.click();

		signinEmail.sendKeys(userName);
		aDriver.hideKeyboard();

		signinPassword.sendKeys(userPassword);
		aDriver.hideKeyboard();

		signinButton.click();

		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SEARCH_TEXT_VIEW)));
		MultiTouchAction multiTouch = new MultiTouchAction(aDriver);
        TouchAction action1 = new TouchAction(aDriver);
        action1.press(searchTextView).waitAction(300).moveTo(10, 0).release();
        multiTouch.add(action1).perform();
		
		wait = new WebDriverWait(aDriver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SEARCH_BAR_CONTAINER)));
		searchBarContainer.sendKeys(searchItem);
		aDriver.hideKeyboard();
		
		Assert.assertTrue(isElementPresent(NConstants.LIST_ITEM_LABEL), "Could not select search product label"+NConstants.LIST_ITEM_LABEL);
		aDriver.pressKeyCode(66); // This is virtual keyboard enter key value
	    itemProductTitle.click();	
	
		wait = new WebDriverWait(aDriver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ITEM_IMAGE)));
		Assert.assertTrue(isElementPresent(NConstants.ITEM_IMAGE), "Could not load product image"+NConstants.ITEM_IMAGE);
		Assert.assertTrue(isElementPresent(NConstants.PRODUCT_BASIC_INFO), "Could not load product basic info"+NConstants.PRODUCT_BASIC_INFO);
		Assert.assertTrue(isElementPresent(NConstants.PRODUCT_PRICE), "Could not load product price"+NConstants.PRODUCT_PRICE);
		navigationMenuImage.click();

	}

    public void search(String searchItem) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(aDriver, 20);

        wait = new WebDriverWait(aDriver, 100);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SEARCH_BAR_CONTAINER)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SEARCH_TEXT_VIEW)));
        searchTextView.click();
        searchEditTextView.sendKeys(searchItem);
        aDriver.hideKeyboard();



        String label = String.format(NConstants.LIST_ITEM_LABEL,searchItem);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(label)));
        Assert.assertTrue(isElementPresent(label), "Could not select search product label: "+label);
        aDriver.pressKeyCode(66); // This is virtual keyboard enter key value
        String titleElem = String.format(NConstants.ITEM_PRODUCT_TITILE,searchItem);
        aDriver.findElementByXPath(titleElem).click();
//        itemProductTitle.click();

        wait = new WebDriverWait(aDriver, 100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ITEM_IMAGE)));
        Assert.assertTrue(isElementPresent(NConstants.ITEM_IMAGE), "Could not load product image: "+NConstants.ITEM_IMAGE);
        String basicInfo = String.format(NConstants.PRODUCT_BASIC_INFO,searchItem);
        Assert.assertTrue(isElementPresent(basicInfo), "Could not load product basic info: "+basicInfo);
        Assert.assertTrue(isElementPresent(NConstants.PRODUCT_PRICE), "Could not load product price: "+NConstants.PRODUCT_PRICE);
//        navigationMenuImage.click();

    }

	public void search2(String searchItem) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(aDriver, 20);

		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SEARCH_TEXT_VIEW)));
		MultiTouchAction multiTouch = new MultiTouchAction(aDriver);
		TouchAction action1 = new TouchAction(aDriver);
		action1.press(searchTextView).waitAction(300).moveTo(10, 0).release();
		multiTouch.add(action1).perform();

		wait = new WebDriverWait(aDriver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.SEARCH_BAR_CONTAINER)));
		searchBarContainer.sendKeys(searchItem);
		aDriver.hideKeyboard();

		String label = String.format(NConstants.LIST_ITEM_LABEL,searchItem);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(label)));
		Assert.assertTrue(isElementPresent(label), "Could not select search product label: "+label);
		aDriver.pressKeyCode(66); // This is virtual keyboard enter key value
		itemProductTitle.click();

		wait = new WebDriverWait(aDriver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ITEM_IMAGE)));
		Assert.assertTrue(isElementPresent(NConstants.ITEM_IMAGE), "Could not load product image: "+NConstants.ITEM_IMAGE);
		String basicInfo = String.format(NConstants.PRODUCT_BASIC_INFO,searchItem);
		Assert.assertTrue(isElementPresent(basicInfo), "Could not load product basic info: "+basicInfo);
		Assert.assertTrue(isElementPresent(NConstants.PRODUCT_PRICE), "Could not load product price: "+NConstants.PRODUCT_PRICE);
//        navigationMenuImage.click();

	}

    public void someOtherStuff(){

        //
//		Log out - removed from this test
//
//		wait = new WebDriverWait(aDriver, 30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_ACCOUNT)));
//		myAccount.click();
//		Thread.sleep(1000);
//		for(int i=0;i<8;i++) {
//			Dimension size = aDriver.manage().window().getSize();
//			int startx = (int) (size.width * 0.70);
//			int endx = (int) (size.width * 0.30);
//			int starty = size.height / 2;
//        	aDriver.swipe(startx, starty, endx, starty, 2000);
//        }
//		wait = new WebDriverWait(aDriver, 30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.MY_PROFILE)));
//        myProfile.click();
//
//		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_IMAGE), "Could not find user image");
//		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_NAME), "Could not find user name text");
//		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_EMAIL), "Could not find user email text");
//		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_PASSWORD), "Could not find user password text");
//		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_FRAGMENT_PASSWORD), "Could not find user framgement password text");
//		Assert.assertTrue(isElementPresent(NConstants.MY_PROFILE_USER_SIGNOUT), "Could not sign out button");
//		myProfileUserSignout.click();
//
//		End Log out
//

		/*itemPickerThumb.click();
		Assert.assertTrue(isElementPresent(NConstants.PICKABLE_ITEM_TITLE), "Could not load pickable item title"+NConstants.PICKABLE_ITEM_TITLE);
		Assert.assertTrue(isElementPresent(NConstants.ROW_INFO_IMAGE), "Could not load product image"+NConstants.ROW_INFO_IMAGE);
		Assert.assertTrue(isElementPresent(NConstants.ROW_INFO_TEXT_PRICE), "Could not load product price"+NConstants.ROW_INFO_TEXT_PRICE);
		Assert.assertTrue(isElementPresent(NConstants.ROW_INFO_TEXT_STOCK), "Could not load product price"+NConstants.ROW_INFO_TEXT_STOCK);
		rowInfoRadio.click();
		itemPickertext.click();
		Assert.assertTrue(isElementPresent(NConstants.SELECT_SIZE), "Could not load select size title"+NConstants.SELECT_SIZE);
		Assert.assertTrue(isElementPresent(NConstants.ROW_INFO_TEXT_PRICE), "Could not load product price"+NConstants.ROW_INFO_TEXT_PRICE);
		rowInfoRadio.click();
		Assert.assertTrue(isElementPresent(NConstants.CENTERED_BUTTON), "Could not load Buy now button"+NConstants.CENTERED_BUTTON);
		Assert.assertTrue(isElementPresent(NConstants.SUPPLIER_INFO), "Could not load supplier info text"+NConstants.SUPPLIER_INFO);

		Dimension dimensions = aDriver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		aDriver.swipe(0, scrollStart, 0, scrollEnd, 700);

		wait = new WebDriverWait(aDriver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.ITEM_ARROW)));
		itemArrow.click();
		Assert.assertTrue(isElementPresent(NConstants.ITEM_DESCRIPTION),"Could not load description text "+NConstants.ITEM_DESCRIPTION);
		Assert.assertTrue(isElementPresent(NConstants.ITEM_DESCRIPTION_DETAIL),"Could not load description detail text "+NConstants.ITEM_DESCRIPTION_DETAIL);


		//Assert.assertTrue(isElementPresent(NConstants.PRODUCT_RESULT), "Could not load product result"+NConstants.PRODUCT_RESULT);
		//Assert.assertTrue(isElementPresent(NConstants.PRODUCT_IMAGE), "Could not load product image"+NConstants.PRODUCT_IMAGE);
		//Assert.assertTrue(isElementPresent(NConstants.PRODUCT_TITILE), "Could not load product title"+NConstants.PRODUCT_TITILE);
		//Assert.assertTrue(isElementPresent(NConstants.PRODUCT_PRICE), "Could not load product price"+NConstants.PRODUCT_PRICE);

		//Assert.assertEquals(productTitle.getText(), "Bahama Mama Bronzer");
		//Assert.assertEquals(productPrice.getText(), "AED 104");

		/*wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PRODUCT_CART)));
		productCart.click();

		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PRODUCT_MENU_CART)));
		productMenuCart.click();

		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CART_SINGLE_LABEL)));

		Assert.assertTrue(isElementPresent(NConstants.CART_SINGLE_LABEL), "Could not load item label"+NConstants.CART_SINGLE_LABEL);
		Assert.assertTrue(isElementPresent(NConstants.CART_ITEM_DELETE), "Could not load delete button "+NConstants.CART_ITEM_DELETE);
		Assert.assertTrue(isElementPresent(NConstants.CART_ITEM_DECREASE), "Could not load decrease image"+NConstants.CART_ITEM_DECREASE);
		Assert.assertTrue(isElementPresent(NConstants.CART_ITEM_INCREASE), "Could not load increase image"+NConstants.CART_ITEM_INCREASE);

		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CART_CHECKOUT_BUTTON)));
		Assert.assertTrue(isElementPresent(NConstants.CART_CHECKOUT_BUTTON), "Could not load checkout button"+NConstants.CART_CHECKOUT_BUTTON);
		cartCheckoutButton.click();

		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PICK_IMAGE)));
		Assert.assertTrue(isElementPresent(NConstants.PICK_IMAGE), "Could not load pick impage"+NConstants.PICK_IMAGE);

		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PICK_LOCATION)));
		Assert.assertTrue(isElementPresent(NConstants.PICK_LOCATION), "Could not load pick location"+NConstants.PICK_LOCATION);
		//pickLocation.click();

		//wait = new WebDriverWait(aDriver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_ADDRESS)));
		//Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_ADDRESS), "Could not load pick location"+NConstants.CHECKOUT_ADDRESS);
		//checkoutAddress.sendKeys("Downtown Dubai - Dubai, United Arab Emirates - Downtown Dubai - Dubai - United Arab Emirates");
		//checkoutAddress.click();

		//Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_ADDRESS1), "Could not load address1 from map"+NConstants.CHECKOUT_ADDRESS1);
		//checkoutAddress1.sendKeys("Downtown Dubai - Dubai, United Arab Emirates - Downtown Dubai - Dubai - United Arab Emirates");
		//checkoutAddress1.click();
		//wait = new WebDriverWait(aDriver, 100);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_ADDRESS2)));
		//Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_ADDRESS2), "Could not load address2 from map"+NConstants.CHECKOUT_ADDRESS2);
		//checkoutAddress2.sendKeys("Downtown Dubai - Dubai, United Arab Emirates - Downtown Dubai - Dubai - United Arab Emirates");
		//checkoutAddress2.click();


		wait = new WebDriverWait(aDriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_ADDRESS_TYPE)));
		Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_ADDRESS_TYPE), "Could not select address Spinner button"+NConstants.CHECKOUT_ADDRESS_TYPE);
		aDriver.findElement(By.xpath(NConstants.CHECKOUT_ADDRESS_TYPE)).click();
		List<AndroidElement> options = aDriver.findElements(By.xpath(NConstants.CHECKOUT_WORK_ADDRESS));
		for (WebElement option : options) {
			String list = option.getText();
			if (list.equals("Address Type - Home")) {
				option.click();
				break;
			}
		}

		wait = new WebDriverWait(aDriver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_ADDRESS_NAME)));
		Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_ADDRESS_NAME), "Could not load checkout address"+NConstants.CHECKOUT_ADDRESS_NAME);
		checkoutAddressName.sendKeys("Home");
		aDriver.hideKeyboard();

		wait = new WebDriverWait(aDriver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_PERSON_NAME)));
		Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_PERSON_NAME),"Could not load checkout person name field"+NConstants.CHECKOUT_PERSON_NAME);
		checkoutPersonName.sendKeys("Mr. Kartik");
		aDriver.hideKeyboard();

		wait = new WebDriverWait(aDriver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_PERSON_MOBILE)));
		Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_PERSON_MOBILE),"Could not load checkout person mobile field"+NConstants.CHECKOUT_PERSON_MOBILE);
		checkoutPersonMobile.sendKeys("0566681264");
		aDriver.hideKeyboard();

		wait = new WebDriverWait(aDriver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_PERSON_APARTMENT)));
		Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_PERSON_APARTMENT),"Could not load checkout person apartment number field"+NConstants.CHECKOUT_PERSON_APARTMENT);
		checkoutPersonApartment.sendKeys("3927");
		aDriver.hideKeyboard();

		wait = new WebDriverWait(aDriver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_PERSON_FLOOR)));
		Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_PERSON_FLOOR),"Could not load checkout person floor number field"+NConstants.CHECKOUT_PERSON_FLOOR);
		checkoutPersonFloor.sendKeys("39");
		aDriver.hideKeyboard();

		wait = new WebDriverWait(aDriver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_PERSON_BUILDING)));
		Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_PERSON_BUILDING),"Could not load checkout person building number field"+NConstants.CHECKOUT_PERSON_BUILDING);
		checkoutPersonBuilding.sendKeys("3");
		aDriver.hideKeyboard();

		wait = new WebDriverWait(aDriver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_PERSON_AREA_NAME)));
		Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_PERSON_AREA_NAME),"Could not load checkout person area name"+NConstants.CHECKOUT_PERSON_AREA_NAME);
		//Assert.assertEquals(checkoutPersonAreaName.getText(), "Downtown Dubai");
		//wait = new WebDriverWait(aDriver, 40);
		//checkoutPersonAreaName.sendKeys("Downtown Dubai");
		//aDriver.hideKeyboard();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_PERSON_LANDMARK)));
		Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_PERSON_LANDMARK),"Could not load checkout person landmark name field"+NConstants.CHECKOUT_PERSON_LANDMARK);
		checkoutPersonLandmark.sendKeys("Burj Al-Arab");
		aDriver.hideKeyboard();
		/*dimensions = aDriver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		aDriver.swipe(0,scrollStart,0,scrollEnd,2000);

		wait = new WebDriverWait(aDriver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_PERSON_CITY)));
		Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_PERSON_CITY),"Could not load checkout person city name field"+NConstants.CHECKOUT_PERSON_CITY);
		checkoutPersonCity.sendKeys("Dubai");
		aDriver.hideKeyboard();

		wait = new WebDriverWait(aDriver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_PERSON_COUNTRY)));
		Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_PERSON_COUNTRY),"Could not load checkout person country name field"+NConstants.CHECKOUT_PERSON_COUNTRY);

		//checkoutPersonCountry.sendKeys("United Arab Emirates");
		//aDriver.hideKeyboard();

		wait = new WebDriverWait(aDriver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.CHECKOUT_SAVE_ADDRESS)));
		Assert.assertTrue(isElementPresent(NConstants.CHECKOUT_SAVE_ADDRESS),"Could not load checkout person save address field"+NConstants.CHECKOUT_SAVE_ADDRESS);
		checkoutSaveAddress.click();
		//aDriver.pressKeyCode(66);



		wait = new WebDriverWait(aDriver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NConstants.PLACE_ORDER)));
		Assert.assertTrue(isElementPresent(NConstants.PLACE_ORDER),"Could not load place order field"+NConstants.PLACE_ORDER);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_TO),"Could not load ship to text"+NConstants.SHIP_TO);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_NAME1),"Could not load ship address 1"+NConstants.SHIP_NAME1);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_NAME1),"Could not load ship address 2"+NConstants.SHIP_NAME2);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_NAME3),"Could not load ship address 3"+NConstants.SHIP_NAME3);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_MAP),"Could not load shiping address map"+NConstants.SHIP_MAP);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_CHOOSE_ADDRESS),"Could not open shipping address alert"+NConstants.SHIP_CHOOSE_ADDRESS);
		shipChooseAddress.click();
		Assert.assertTrue(isElementPresent(NConstants.SHIP_ADDRESS_ALERT),"Could not see shipping address alert text"+NConstants.SHIP_ADDRESS_ALERT);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_ADDRESS_ALERT_CANCEL),"Could not load shipping alert cancel button"+NConstants.SHIP_ADDRESS_ALERT_CANCEL);
		shipAddressAlertCancel.click();
		Assert.assertTrue(isElementPresent(NConstants.SHIP_ITEM_IMAGE),"Could not load shipping item image"+NConstants.SHIP_ITEM_IMAGE);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_ITEM_NAME),"Could not load shipping item name"+NConstants.SHIP_ITEM_NAME);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_ITEM_PRICE),"Could not load shipping item price"+NConstants.SHIP_ITEM_PRICE);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_ITEM_QUANTITY),"Could not load shipping item quantity"+NConstants.SHIP_ITEM_QUANTITY);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_ITEM_VALUE),"Could not load shipping item value"+NConstants.SHIP_ITEM_VALUE);

		dimensions = aDriver.manage().window().getSize();
		Double screenHeightStart1 = dimensions.getHeight() * 0.5;
		int scrollStart1 = screenHeightStart1.intValue();
		Double screenHeightEnd1 = dimensions.getHeight() * 0.2;
		int scrollEnd1 = screenHeightEnd1.intValue();
		aDriver.swipe(0,scrollStart1,0,scrollEnd1,500);




		Assert.assertTrue(isElementPresent(NConstants.SHIP_INFO),"Could not load shipping delivery info"+NConstants.SHIP_INFO);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_INFO_IMAGE),"Could not load shipping delivery info image"+NConstants.SHIP_INFO_IMAGE);
		Shipinfo.click();
		Assert.assertTrue(isElementPresent(NConstants.SHIP_INFO_ALERT_TITLE),"Could not load shipping delivery option text"+NConstants.SHIP_INFO_ALERT_TITLE);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_INFO_ALERT_INFO),"Could not load shipping delivery info"+NConstants.SHIP_INFO_ALERT_INFO);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_INFO_ALERT_CANCEL),"Could not load shipping delivery info alert cancel button"+NConstants.SHIP_INFO_ALERT_CANCEL);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_SUBTOTAL),"Could not load item subtotal value"+NConstants.SHIP_SUBTOTAL);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_CHARGE),"Could not load shipping item value"+NConstants.SHIP_CHARGE);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_TOTAL),"Could not load shipping item total"+NConstants.SHIP_TOTAL);
		dimensions = aDriver.manage().window().getSize();
		Double screenHeightStart2 = dimensions.getHeight() * 0.5;
		int scrollStart2 = screenHeightStart2.intValue();
		Double screenHeightEnd2 = dimensions.getHeight() * 0.2;
		int scrollEnd2 = screenHeightEnd2.intValue();
		aDriver.swipe(0,scrollStart2,0,scrollEnd2,2000);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_TOTAL1),"Could not load shipping item total1"+NConstants.SHIP_TOTAL1);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_PRICE_VALUE),"Could not load shipping price value"+NConstants.SHIP_PRICE_VALUE);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_SHIPPING),"Could not load shipping delivery charge label"+NConstants.SHIP_SHIPPING);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_PRICE_SUB_COMPONENT),"Could not load shipping delivery chrage value"+NConstants.SHIP_PRICE_SUB_COMPONENT);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_GRAND_TOTAL),"Could not load shipping item grand total label"+NConstants.SHIP_GRAND_TOTAL);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_GRAND_TOTAL_VALUE),"Could not load shipping item grand total value"+NConstants.SHIP_GRAND_TOTAL_VALUE);
		Assert.assertTrue(isElementPresent(NConstants.SHIP_CONTINUE_BUTTON),"Could not load continue button"+NConstants.SHIP_CONTINUE_BUTTON);
		shipContinueButton.click();

		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_DETAILS),"Could not load payment details label"+NConstants.PAYMENT_DETAILS);
		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_CARD_TITLE),"Could not load credit card title"+NConstants.PAYMENT_CARD_TITLE);
		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_AMOUNT),"Could not load amount text"+NConstants.PAYMENT_AMOUNT);
		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_CARD_NUMBER_LABEL),"Could not load card numberlabel"+NConstants.PAYMENT_CARD_NUMBER_LABEL);
		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_CARD_NUMBER),"Could not load credit card text field"+NConstants.PAYMENT_CARD_NUMBER);
		paymentCardNumber.sendKeys("4000 0000 0000 0002");
		aDriver.hideKeyboard();
		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_CARD_EXPIRATION_DATE),"Could not load credit card expiry date label"+NConstants.PAYMENT_CARD_EXPIRATION_DATE);
		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_CARD_MONTH),"Could not load credit card expiry month spinner"+NConstants.PAYMENT_CARD_MONTH);
		paymentCardMonth.click();
		List<AndroidElement> months = aDriver.findElements(By.xpath(NConstants.PAYMENT_CARD_MONTH_NAME));
		for (WebElement month : months) {
			String list = month.getText();
			if (list.equals("06")) {
				month.click();
				break;
			}
		}
		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_CARD_YEAR),"Could not load credit card expiry year label"+NConstants.PAYMENT_CARD_YEAR);
		paymentCardYear.click();
		List<AndroidElement> years = aDriver.findElements(By.xpath(NConstants.PAYMENT_CARD_YEAR_NAME));
		for (WebElement year : years) {
			String list = year.getText();
			if (list.equals("2018")) {
				year.click();
				break;
			}
		}
		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_CVV_CODE_LABEL),"Could not load credit card CVV code label"+NConstants.PAYMENT_CVV_CODE_LABEL);
		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_CVV_CODE_NUMBER),"Could not load credit card CVV code"+NConstants.PAYMENT_CVV_CODE_NUMBER);
		paymentCvvCodeNumber.sendKeys("123");
		aDriver.hideKeyboard();
		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_CVV_CODE_INFO),"Could not load credit card CVV info"+NConstants.PAYMENT_CVV_CODE_INFO);
		PaymentCvvCodeInfo.click();
		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_CVV_CODE_INFO_IMAGE),"Could not load credit card CVV info image"+NConstants.PAYMENT_CVV_CODE_INFO_IMAGE);
		PaymentCvvCodeInfoImage.click();
		Assert.assertTrue(isElementPresent(NConstants.PAYMENT_CARD_SAVE),"Could not load credit card save box"+NConstants.PAYMENT_CARD_SAVE);
		paymentCardSave.click();
		Assert.assertTrue(isElementPresent(NConstants.FOOTER_TEXT),"Could not load footer text"+NConstants.FOOTER_TEXT);
		Assert.assertTrue(isElementPresent(NConstants.FOOTER_LOGO),"Could not load footer logo"+NConstants.FOOTER_LOGO);
		Assert.assertTrue(isElementPresent(NConstants.PAY_BUTTON),"Could not load pay button"+NConstants.PAY_BUTTON);
		payButton.click();*/

    }
}
