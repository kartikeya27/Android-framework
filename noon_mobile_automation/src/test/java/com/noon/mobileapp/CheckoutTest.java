package com.noon.mobileapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.CheckoutPage;
import com.noon.mobileapp.pages.HomePage;
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
		
		CheckoutPage checkoutPage = new CheckoutPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),checkoutPage);
		String userName = "noontesting2+11@gmail.com";
		String password = "1200@Villa";
		//String searchText = "TheBalm Bronzer/Blush";
		
		checkoutPage.checkout(userName, password);
	}
}	
