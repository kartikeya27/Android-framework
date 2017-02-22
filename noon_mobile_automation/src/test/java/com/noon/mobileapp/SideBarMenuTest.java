package com.noon.mobileapp;

import com.noon.mobileapp.pages.SideMenuPage;
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

        PageFactory.initElements(new AppiumFieldDecorator(aDriver),menuPage);

        String userName = "noontesting2+11@gmail.com";
        String password = "1200@Villa";

        menuPage.menuTest(userName, password);

	}
}
