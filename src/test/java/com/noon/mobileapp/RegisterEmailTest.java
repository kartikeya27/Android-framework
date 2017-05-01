package com.noon.mobileapp;

import com.noon.mobileapp.pages.SigninPage;
import org.junit.Ignore;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.RegisterPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objects.User;

public class RegisterEmailTest extends BaseTest {
	
	String testName="RegisterEmailTest";
	
	@Test
	public void registerEmailTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the register test");

		launchApp();
		allowAppPermission();
		test.log(LogStatus.INFO, "App Launch successfully");
		
		RegisterPage registerPage = new RegisterPage(aDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),registerPage);
		SigninPage signinPage = new SigninPage(aDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);

        User user = new User("android");

		registerPage.registerTest(user.getEmail());
		signinPage.verifyLogin();
	}
	
}
