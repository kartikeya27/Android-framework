package com.noon.mobileapp;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.AddressPage;
import com.noon.mobileapp.pages.SigninPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddressTest extends BaseTest {
	
String testName="AddressTest";
	

	@Test
	public void AddressTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the Address in test");

		launchApp();
		allowAppPermission();
		test.log(LogStatus.INFO, "App Launch successfully");
		
		SigninPage signinPage = new SigninPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);
		AddressPage addressPage = new AddressPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),addressPage);

		String userName = "noontesting2+11@gmail.com";
		String password = "1200@Villa";
		
		signinPage.signinWithEmail(userName,password);
		addressPage.goToAddressBook();
		addressPage.addFirstAddress();
		addressPage.addAddressSteps();

		
		test.log(LogStatus.PASS, "Test Passed");
	}

}
