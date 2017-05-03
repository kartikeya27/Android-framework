package com.noon.mobileapp;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.*;
import com.relevantcodes.extentreports.LogStatus;
import dtos.catalog.Page;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import services.ProductService;


public class OrderCODTest extends BaseTest {
	
	String testName="CheckoutCODTest";
	
	@Test
	public void checkoutCodTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the order with with Test product COD ");

		String userName = "testnoon10@gmail.com";
		String password = "Test1234";

		emptyCart(userName,password);
		deleteAllAddresses(userName, password);
		addDefaultAddress(userName, password);
        addTestProductToCart(userName, password);
        launchApp();
        allowAppPermission();

		SearchPage searchPage = new SearchPage(aDriver,test);
		SigninPage signinPage = new SigninPage(aDriver,test);
		ProductPage productPage = new ProductPage(aDriver,test);
		CheckoutPage checkoutPage = new CheckoutPage(aDriver,test);
		CartPage cartPage = new CartPage(aDriver,test);
        TopMenuPage topMenuPage = new TopMenuPage(aDriver,test);

        PageFactory.initElements(new AppiumFieldDecorator(aDriver),searchPage);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),checkoutPage);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),cartPage);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),productPage);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),topMenuPage);

        signinPage.signinWithEmail(userName,password);
        cartPage.goToCart();

        cartPage.checkout();
		checkoutPage.checkoutDefaultAddress();
        checkoutPage.checkoutCod();
        checkoutPage.order();
        checkoutPage.thankYouPage();


		test.log(LogStatus.INFO, "order COD test passed");
	}
}	
