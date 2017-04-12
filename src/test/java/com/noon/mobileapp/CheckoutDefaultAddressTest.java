package com.noon.mobileapp;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.*;
import com.relevantcodes.extentreports.LogStatus;
import dtos.catalog.Page;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import services.ProductService;


public class CheckoutDefaultAddressTest extends BaseTest {
	
	String testName="CheckoutDefaultAddressTest";
	
	@Test
	public void checkoutDefaultAddressTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the checkout default address in test");

		String userName = "testnoon10@gmail.com";
		String password = "Test1234";
		emptyCart(userName,password);
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

		ProductService productService = new ProductService();
		Page page = productService.getProduct("Toy");

		String searchText = page.getName();

        signinPage.signinWithEmail(userName,password);
        searchPage.search(searchText);
        productPage.addProductToCart();

        cartPage.checkout();
		checkoutPage.checkoutDefaultAddress();

//        topMenuPage.gotoHome();
//        topMenuPage.gotoCart();
//        cartPage.removeFromCart();
//        cartPage.verifyCartIsEmpty();

		test.log(LogStatus.INFO, "Checkout test passed");
	}
}	
