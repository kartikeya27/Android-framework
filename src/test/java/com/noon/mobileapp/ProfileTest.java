package com.noon.mobileapp;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.ProfilePage;
import com.noon.mobileapp.pages.SideMenuPage;
import com.noon.mobileapp.pages.SigninPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ProfileTest extends BaseTest {
	
String testName="ProfileTest";



    @Test
	public void profileTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the Sign in test");

        String userName = "testnoon10@gmail.com";
        String password = "Test1234";

		launchApp();
		allowAppPermission();
		test.log(LogStatus.INFO, "App Launch successfully");

		SigninPage signinPage = new SigninPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);

	    SideMenuPage sideMenuPage = new SideMenuPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),sideMenuPage);

        ProfilePage profilePage = new ProfilePage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),profilePage);

		String name = "John Smith";

		signinPage.signinWithEmail(userName,password);
        sideMenuPage.goToMenuPage();
        sideMenuPage.goToMyAccountPage();
        profilePage.goToProfilePage();
        profilePage.verifyProfilePage(userName,name);
        profilePage.logout();

		test.log(LogStatus.PASS, "Test Passed");
	}

    public void logoutTest() throws InterruptedException {
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
        signinPage.logout();


        test.log(LogStatus.PASS, "Test Passed");
    }


}
