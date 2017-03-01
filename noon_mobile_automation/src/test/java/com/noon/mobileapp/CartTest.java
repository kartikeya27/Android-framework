package com.noon.mobileapp;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.CartPage;
import com.noon.mobileapp.pages.ProductPage;
import com.noon.mobileapp.pages.SearchPage;
import com.noon.mobileapp.pages.SigninPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
	
	String testName="SearchTest";
	
	@Test
	public void cartTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the cart test");
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

		String searchText = "The Girl With No Name";
        String userName = "noontesting2+11@gmail.com";
        String password = "1200@Villa";

        signinPage.signinWithEmail(userName,password);
		searchPage.search(searchText);
		productPage.addProductToCart();
		cartPage.increase();
		cartPage.increase();
        cartPage.increase();
        cartPage.decrease();
        cartPage.removeFromCart();
		test.log(LogStatus.INFO, "Cart test passed");

	}
}	
