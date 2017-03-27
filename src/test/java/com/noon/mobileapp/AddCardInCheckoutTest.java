package com.noon.mobileapp;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.*;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.LogStatus;
import dtos.catalog.Page;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import services.ProductService;

public class AddCardInCheckoutTest extends BaseTest {
	
String testName="AddNewCardTest";

	@Test
	public void addNewCardInCheckoutTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting add new card test");

		launchApp();
		allowAppPermission();
		test.log(LogStatus.INFO, "App Launch successfully");
		
		SigninPage signinPage = new SigninPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);

		SideMenuPage menuPage = new SideMenuPage(aDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),menuPage);

		MyWalletPage walletPage = new MyWalletPage(aDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),walletPage);

		AddCardPage addCardPage = new AddCardPage(aDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),addCardPage);

		SearchPage searchPage = new SearchPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),searchPage);

		ProductPage productPage = new ProductPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),productPage);

		CheckoutPage checkoutPage = new CheckoutPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),checkoutPage);

		CartPage cartPage = new CartPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),cartPage);

		TopMenuPage topMenuPage = new TopMenuPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),topMenuPage);

		String userName = "testnoon10@gmail.com";
		String password = "Test1234";

        ProductService productService = new ProductService();
        Page page = productService.getProduct("Cake");

        String searchText = page.getName();

        signinPage.signinWithEmail(userName,password);
        searchPage.search(searchText);
        productPage.addProductToCart();
        cartPage.checkout();
        checkoutPage.checkoutPickDefaultAddress();
        checkoutPage.checkoutPickAddNewCC();
		addCardPage.addNewCardData("Antanina","4573770040715945","2020","12", false);

		test.log(LogStatus.PASS, "Test Passed");
	}
}
