package com.noon.mobileapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.RegisterPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterTest extends BaseTest {
	
	String testName="RegisterTest";
	
	@Test
	public void registerTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the register test");
		launchApp();
		
		RegisterPage registerPage = new RegisterPage(aDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),registerPage);
		registerPage.registerTest();
	}
	
}
