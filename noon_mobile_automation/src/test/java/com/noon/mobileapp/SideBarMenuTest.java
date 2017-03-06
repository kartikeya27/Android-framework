package com.noon.mobileapp;

import com.noon.mobileapp.pages.SideMenuPage;
import com.noon.mobileapp.pages.SigninPage;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.mobileapp.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;


public class SideBarMenuTest extends BaseTest {
	String testName="SideBarMenuTest";
	
	@Test
	public void sideBarMenuTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting SideBarMenu test");
		
		launchApp();
		allowAppPermission();
		test.log(LogStatus.INFO, "Apps Launched successfully");

        SideMenuPage menuPage = new SideMenuPage(aDriver, test);
        SigninPage signinPage = new SigninPage(aDriver, test);

        PageFactory.initElements(new AppiumFieldDecorator(aDriver),menuPage);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);

        String userName = "testnoon10@gmail.com";
        String password = "Test1234";

        signinPage.signinWithEmail(userName,password);
        menuPage.goToMenuPage();
        menuPage.menuTest(userName, password);

	}
}
