package com.noon.mobileapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.SearchPage;
import com.noon.mobileapp.pages.HomePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import sun.launcher.resources.launcher_zh_CN;

public class SearchTest extends BaseTest {
	
	String testName="SearchTest";
	
	@Test
	public void searchTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the search item test");
		launchApp();
		allowAppPermission();

		SearchPage searchPage = new SearchPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),searchPage);
		String userName = "noontesting2+12@gmail.com";
		String password = "1200@Villa";
		String searchText = "The Girl With No Name";
		
		searchPage.search(userName, password, searchText);
		test.log(LogStatus.INFO, "Search test passed");
	}
}	
