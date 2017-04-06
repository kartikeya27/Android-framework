package com.noon.mobileapp;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.CartPage;
import com.noon.mobileapp.pages.ProductPage;
import com.noon.mobileapp.pages.SearchPage;
import com.noon.mobileapp.pages.SigninPage;
import com.relevantcodes.extentreports.LogStatus;
import dtos.catalog.Page;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import services.ProductService;

public class BuyNowTest extends BaseTest {
	
	String testName="Buy Now";
	
	@Test
	public void butNowTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the buy now test");
		launchApp();
		allowAppPermission();

		SearchPage searchPage = new SearchPage(aDriver,test);
		SigninPage signinPage = new SigninPage(aDriver,test);
        ProductPage productPage = new ProductPage(aDriver,test);
        CartPage cartPage = new CartPage(aDriver,test);

        PageFactory.initElements(new AppiumFieldDecorator(aDriver),productPage);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),searchPage);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),cartPage);

        ProductService productService = new ProductService();
        Page page = productService.getProduct("Toy");

		String searchText = page.getName();
		String userName = "testnoon10@gmail.com";
		String password = "Test1234";

        signinPage.signinWithEmail(userName,password);
		searchPage.search(searchText);
		productPage.buyNow();
		test.log(LogStatus.INFO, "Cart test passed");

	}
}	
