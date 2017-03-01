package com.noon.mobileapp;

import com.noon.mobileapp.pages.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import sun.launcher.resources.launcher_zh_CN;

public class CheckoutTest extends BaseTest {
	
	String testName="CheckoutTest";
	
	@Test
	public void checkoutTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the checkout in test");

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


        String userName = "noontesting2+11@gmail.com";
		String password = "1200@Villa";
		String searchText = "The Girl With No Name";



        signinPage.signinWithEmail(userName,password);
        searchPage.search(searchText);
        productPage.addProductToCart();

        cartPage.checkout();
        checkoutPage.checkoutVerify();

        topMenuPage.gotoHome();
        topMenuPage.gotoCart();
        cartPage.removeFromCart();
        cartPage.verifyCartIsEmpty();

		test.log(LogStatus.INFO, "Checkout test passed");
	}
}	
