package com.noon.mobileapp;

import com.noon.mobileapp.pages.*;
import dtos.catalog.Page;
import dtos.catalog.ProductByNinResponse;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.testng.annotations.Test;

import com.noon.mobileapp.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import services.ProductService;

import java.util.regex.Pattern;

import static org.slf4j.LoggerFactory.getLogger;

public class SearchTest extends BaseTest {
	
	String testName="SearchTest";
	
	@Test
	public void searchTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the search item test");

		String userName = "testnoon10@gmail.com";
		String password = "Test1234";
		launchApp();
		allowAppPermission();

		SearchPage searchPage = new SearchPage(aDriver,test);
		SigninPage signinPage = new SigninPage(aDriver,test);
        ProductPage productPage = new ProductPage(aDriver,test);

        PageFactory.initElements(new AppiumFieldDecorator(aDriver),productPage);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),searchPage);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);

		ProductService productService = new ProductService();
//		Page page = productService.getProduct("Toy");
        boolean isAlpha = false;
        ProductByNinResponse prod = null;
        prod = productService.getTestProduct();
        System.out.println("Name: " + prod.getName());

		String searchText = prod.getName();

//        signinPage.signinWithEmail(userName,password);
		searchPage.search(searchText);
		test.log(LogStatus.INFO, "Search test passed");

	}
}	
