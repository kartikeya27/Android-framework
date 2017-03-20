package com.noon.mobileapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.SigninPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SigninEmailTest extends BaseTest {
	
String testName="SigninEmailTest";

	@Test
	public void loginTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the Sign in test");

		launchApp();
		allowAppPermission();
		test.log(LogStatus.INFO, "App Launch successfully");
		
		SigninPage signinPage = new SigninPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);

		String userName = "testnoon10@gmail.com";
		String password = "Test1234";
		
		signinPage.signinWithEmail(userName,password);
		signinPage.verifyLogin();
		signinPage.logout();

		test.log(LogStatus.PASS, "Test Passed");
	}
}
