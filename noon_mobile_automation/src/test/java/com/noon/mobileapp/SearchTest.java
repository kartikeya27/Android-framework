package com.noon.mobileapp;

import com.noon.mobileapp.pages.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.mobileapp.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchTest extends BaseTest {
	
	String testName="SearchTest";
	
	@Test
	public void searchTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the search item test");
		launchApp();
		allowAppPermission();

		SearchPage searchPage = new SearchPage(aDriver,test);
		SigninPage signinPage = new SigninPage(aDriver,test);
        ProductPage productPage = new ProductPage(aDriver,test);

        PageFactory.initElements(new AppiumFieldDecorator(aDriver),productPage);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),searchPage);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);
		String searchText = "New One Minute Manager";
		String userName = "testnoon10@gmail.com";
		String password = "Test1234";

        signinPage.signinWithEmail(userName,password);
		searchPage.search(searchText);
		test.log(LogStatus.INFO, "Search test passed");

	}
}	
