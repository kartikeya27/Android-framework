package com.noon.mobileapp;

import org.junit.Ignore;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.CategoriesPage;
import com.noon.mobileapp.pages.HomePage;
import com.noon.mobileapp.util.DataUtil;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class FindElectronicTest extends BaseTest {
	String testName="FindElectronicPageTest";
	
	@Ignore
	public void findElectronicPageTest() throws InterruptedException {
//		test = rep.startTest(testName);
//		test.log(LogStatus.INFO, "Starting the test");
//		if(!DataUtil.isExecutable(xls,testName)) {
//					test.log(LogStatus.SKIP, "Skipping the test as Runmode was NO");
//					throw new SkipException("Skipping the test as Runmode was NO");
//				}
//		launchApp();
//		test.log(LogStatus.INFO, "App Launch successfully");
//
//		HomePage homePage = new HomePage(aDriver, test);
//		PageFactory.initElements(new AppiumFieldDecorator(aDriver), homePage);
//
//		if(!homePage.isElementPresent(NConstants.NAVIGATION_MENU_IMAGE)) {
//			homePage.reportFail("Navigation menu not found");
//		}
//		Object resultPage = homePage.selectFromNavigationMenu();
//		//Assert.assertTrue(resultPage != null, "Could not load Electronics & Applicances page");
//		if(resultPage==null) {
//			homePage.reportFail("Could not load Electronics & Applicances page");
//		}
//		if(!(resultPage instanceof CategoriesPage)) {
//			//Assert.fail("Result page was not Electronics & Applicances page");
//			homePage.reportFail("Result page was not Electronics & Applicances page");
//		}
//		//homePage.getMenu().gotoCart();
//		//If we reach here that means we landed on Electronics & Applicances page
//		test.log(LogStatus.INFO, "Reached Electronics & Applicances page");
//		CategoriesPage electronicPage = (CategoriesPage)resultPage;
//		electronicPage.applyFilter();
//		test.log(LogStatus.PASS, "Test Passed");
	}
}
